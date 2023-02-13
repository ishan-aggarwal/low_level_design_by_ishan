package com.ishan;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType) {

        if (VehicleType.BIKE.name().equalsIgnoreCase(vehicleType)) {
            return new Bike();
        } else if (VehicleType.CAR.name().equalsIgnoreCase(vehicleType)) {
            return new Car();
        }
        return new NullObject();
    }
}
