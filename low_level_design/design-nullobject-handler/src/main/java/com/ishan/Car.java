package com.ishan;

public class Car implements Vehicle {


    @Override
    public int getFuelTankCapacity() {
        return 55;
    }

    @Override
    public int getSeatCapacity() {
        return 5;
    }
}
