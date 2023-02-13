package com.ishan;

public class Bike implements Vehicle {

    @Override
    public int getFuelTankCapacity() {
        return 10;
    }

    @Override
    public int getSeatCapacity() {
        return 2;
    }
}

