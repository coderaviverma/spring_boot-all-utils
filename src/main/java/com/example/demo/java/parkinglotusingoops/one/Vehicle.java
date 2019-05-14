package com.example.demo.java.parkinglotusingoops.one;

import java.util.ArrayList;

public abstract class Vehicle {

    ArrayList<ParkingSpot> spotsList=new ArrayList<>();
    protected String licensePlate;
    protected int spotNeeded;
    protected VehicleSize size;

    public int getSpotNeeded() {
        return spotNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void clearSpot(){

    }

    public void parkingSpot(ParkingSpot p){
        spotsList.add(p);
    }

    public abstract boolean canFitInSize();
}
