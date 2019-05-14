package com.example.demo.java.parkinglotusingoops.one;

public class Car extends Vehicle {
    public Car() {

        size=VehicleSize.COMPACT;
        spotNeeded=1;
    }

    @Override
    public boolean canFitInSize() {
        return false;
    }
}
