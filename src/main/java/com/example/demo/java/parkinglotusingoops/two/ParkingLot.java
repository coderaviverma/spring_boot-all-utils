package com.example.demo.java.parkinglotusingoops.two;

import java.util.Iterator;
import java.util.Vector;

public class ParkingLot {


    Vector<ParkingSpace> vacantParkingSpaces = null;
    Vector<ParkingSpace> fullParkingSpaces = null;

    int parkingSpaceCount = 0;

    boolean isFull;
    boolean isEmpty;

    ParkingSpace findNearestVacant(ParkingType type)
    {
        Iterator<ParkingSpace> itr = vacantParkingSpaces.iterator();

        while(itr.hasNext())
        {
            ParkingSpace parkingSpace = itr.next();

            if(parkingSpace.parkingType == type)
            {
                return parkingSpace;
            }
        }
        return null;
    }

    void parkVehicle(ParkingType type, Vehicle vehicle)
    {
        if(!isFull())
        {
            ParkingSpace parkingSpace = findNearestVacant(type);

            if(parkingSpace != null)
            {
                parkingSpace.vehicle = vehicle;
                parkingSpace.isVacant = false;

                vacantParkingSpaces.remove(parkingSpace);
                fullParkingSpaces.add(parkingSpace);

                if(fullParkingSpaces.size() == parkingSpaceCount)
                    isFull = true;

                isEmpty = false;
            }
        }
    }

    void releaseVehicle(Vehicle vehicle)
    {
        if(!isEmpty())
        {
            Iterator<ParkingSpace> itr = fullParkingSpaces.iterator();

            while(itr.hasNext())
            {
                ParkingSpace parkingSpace = itr.next();

                if(parkingSpace.vehicle.equals(vehicle))
                {
                    fullParkingSpaces.remove(parkingSpace);
                    vacantParkingSpaces.add(parkingSpace);

                    parkingSpace.isVacant = true;
                    parkingSpace.vehicle = null;

                    if(vacantParkingSpaces.size() == parkingSpaceCount)
                        isEmpty = true;

                    isFull = false;
                }
            }
        }
    }

    boolean isFull()
    {
        return isFull;
    }

    boolean isEmpty()
    {
        return isEmpty;
    }
}
