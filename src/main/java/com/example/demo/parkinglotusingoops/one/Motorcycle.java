package com.example.demo.parkinglotusingoops.one;

public class Motorcycle extends Vehicle {
    public Motorcycle() {
        size=VehicleSize.MOTORCYCLE;
        spotNeeded=1;
    }

    @Override
    public boolean canFitInSize() {
        return false;
    }
}
