package com.ishan;

import com.ishan.model.Location;
import com.ishan.model.ReservationType;
import com.ishan.model.User;
import com.ishan.model.product.Vehicle;
import com.ishan.model.product.VehicleStatus;
import com.ishan.model.product.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StoreService {

    int storeId;
    String storeName;
    Location storeLocation;
    VehicleInventoryService inventoryManagement;
    final Map<Integer, ReservationService> activeReservationMap = new HashMap<>();
    final Map<Integer, ReservationService> completedReservationMap = new HashMap<>();

    private static final AtomicInteger RESERVATION_ID_GENERATOR = new AtomicInteger(1);

    public List<Vehicle> getVehiclesByType(VehicleType vehicleType) {
        List<Vehicle> allVehiclesInStoreInventory = inventoryManagement.getVehicles();
        List<Vehicle> filteredVehicles = new ArrayList<>();
        for (Vehicle vehicle : allVehiclesInStoreInventory) {
            if (vehicle.getVehicleType() == vehicleType && vehicle.getStatus() == VehicleStatus.AVAILABLE) {
                filteredVehicles.add(vehicle);
            }
        }
        return filteredVehicles;
    }

    //addVehicles, update vehicles, use inventory management to update those.
    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagement = new VehicleInventoryService(vehicles);
    }

    public ReservationService makeReservation(User user, Vehicle vehicle, ReservationType reservationType) {
        int reservationId = RESERVATION_ID_GENERATOR.getAndIncrement();
        ReservationService reservation = new ReservationService();
        reservation.create(reservationId, user, vehicle, reservationType);
        activeReservationMap.put(reservationId, reservation);
        vehicle.setStatus(VehicleStatus.RESERVED);
        return reservation;
    }

    public boolean completeReservation(ReservationService reservation) {
        int reservationId = reservation.getReservationId();
        Vehicle vehicle = reservation.getVehicle();
        vehicle.setStatus(VehicleStatus.AVAILABLE);
        if (activeReservationMap.containsKey(reservationId)) {
            activeReservationMap.remove(reservationId);
            // to maintain history
            completedReservationMap.put(reservationId, reservation);
            return true;
        } else {
            throw new RuntimeException("Reservation not found");
        }
    }

    // update reservation

}

