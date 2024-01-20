package com.ishan;

import com.ishan.model.*;
import com.ishan.model.product.*;

import java.util.ArrayList;
import java.util.List;

// VehicleRentalSystem Application is the main class which will be used by the administrator.
public class VehicleRentalSystemApp {
    public static void main(String[] args) {

        // add users
        List<User> users = addUsers();
        System.out.println("Users added successfully");

        // add vehicles
        List<Vehicle> vehicles = addVehicles();

        // add stores
        List<StoreService> stores = addStores(vehicles);
        System.out.println("Vehicles and Stores added successfully");

        // create a rental system with the stores and users
        VehicleRentalService rentalSystem = new VehicleRentalService(stores, users);
        System.out.println("Vehicle Rental System created successfully");

        // 0. User comes
        User userCameForReservation = users.get(0);
        System.out.println("User came for reservation: " + userCameForReservation.getUserName());

        // 1. user search store based on location
        Location location = getLocation();
        StoreService store = rentalSystem.getStoreByLocation(location);
        System.out.println("Store found: " + store.getStoreName());

        // 2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> vehicleList = store.getVehiclesByType(VehicleType.CAR);
        if (vehicleList.isEmpty()) {
            System.out.println("No vehicles available in the store");
            return;
        }
        System.out.println("Total Vehicles found based on user choice: " + vehicleList.size() + " for type: " + VehicleType.CAR);

        // 3. reserving the particular vehicle
        ReservationService reservation = store.makeReservation(userCameForReservation, vehicleList.get(0), ReservationType.DAILY);
        System.out.println("Reservation created successfully: " + reservation);

        // 4. generate the bill
        BillService bill = new BillService(reservation);
        System.out.println("Bill generated: " + bill);

        // 5. make payment
        PaymentService payment = new PaymentService();
        payment.payBill(bill);

        // 6. trip completed, submit the vehicle and close the reservation
        boolean status = store.completeReservation(reservation);
        System.out.println("Reservation completed: " + status);
    }

    private static Location getLocation() {
        return new Location(403012, "Bangalore", "Karnataka", "India");
    }

    private static List<Vehicle> addVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleID(1);
        vehicle1.setVehicleType(VehicleType.CAR);
        vehicle1.setStatus(VehicleStatus.AVAILABLE);
        vehicle1.setHourlyRentalCost(100);
        vehicle1.setDailyRentalCost(1000);

        Vehicle vehicle2 = new Car();
        vehicle2.setVehicleID(2);
        vehicle2.setVehicleType(VehicleType.CAR);
        vehicle2.setStatus(VehicleStatus.AVAILABLE);
        vehicle2.setHourlyRentalCost(150);
        vehicle2.setDailyRentalCost(1500);

        Vehicle vehicle3 = new Bike();
        vehicle3.setVehicleID(3);
        vehicle3.setVehicleType(VehicleType.BIKE);
        vehicle3.setStatus(VehicleStatus.AVAILABLE);
        vehicle3.setHourlyRentalCost(20);
        vehicle3.setDailyRentalCost(200);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);

        return vehicles;
    }

    // Method to add users
    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setUserId(1);
        user1.setUserName("Ishan");


        User user2 = new User();
        user2.setUserId(2);
        user2.setUserName("Apoorv");

        users.add(user1);
        users.add(user2);

        return users;
    }

    private static List<StoreService> addStores(List<Vehicle> vehicles) {
        List<StoreService> stores = new ArrayList<>();

        StoreService store1 = new StoreService();
        store1.setStoreId(1);
        store1.setStoreName("Cars 24 Bangalore Store");
        store1.setVehicles(vehicles);
        store1.setStoreLocation(getLocation());

        stores.add(store1);
        return stores;
    }
}
