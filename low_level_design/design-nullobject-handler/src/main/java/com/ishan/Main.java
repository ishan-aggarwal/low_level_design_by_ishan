package com.ishan;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String type = "car";
        Vehicle vehicle = VehicleFactory.getVehicle(type);

        System.out.println("Vehicle type: " + type);
        System.out.printf("Fuel tank capacity: %d%n", vehicle.getFuelTankCapacity());
        System.out.println("Seat capacity: " + vehicle.getSeatCapacity());

        type = "bike";
        vehicle = VehicleFactory.getVehicle(type);

        System.out.println("Vehicle type: " + type);
        System.out.printf("Fuel tank capacity: %d%n", vehicle.getFuelTankCapacity());
        System.out.println("Seat capacity: " + vehicle.getSeatCapacity());

        type = null;
        vehicle = VehicleFactory.getVehicle(type);

        System.out.println("Vehicle type: " + type);
        System.out.printf("Fuel tank capacity: %d%n", vehicle.getFuelTankCapacity());
        System.out.println("Seat capacity: " + vehicle.getSeatCapacity());

    }
}