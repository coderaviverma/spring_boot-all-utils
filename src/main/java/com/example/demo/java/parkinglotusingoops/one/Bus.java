package com.example.demo.java.parkinglotusingoops.one;

public class Bus extends Vehicle {
    public Bus() {
        size=VehicleSize.LARGE;
        spotNeeded=5;
    }

    @Override
    public boolean canFitInSize() {
        return false;
    }
}
