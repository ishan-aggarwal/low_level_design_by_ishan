package com.ishan;

import com.ishan.model.product.Vehicle;

import java.util.List;

public class VehicleInventoryService {
    List<Vehicle> vehicles;

    VehicleInventoryService(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}

