package com.ishan;

public class NullObject implements Vehicle {

    @Override
    public int getFuelTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatCapacity() {
        return 0;
    }
}
