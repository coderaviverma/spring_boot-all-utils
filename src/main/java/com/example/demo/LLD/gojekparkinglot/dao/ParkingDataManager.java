/**
 * 
 */
package com.example.demo.LLD.gojekparkinglot.dao;

import com.example.demo.LLD.gojekparkinglot.model.Vehicle;

import java.util.List;


public interface ParkingDataManager<T extends Vehicle>
{
	public int parkCar(int level, T vehicle);
	
	public boolean leaveCar(int level, int slotNumber);
	
	public List<String> getStatus(int level);
	
	public List<String> getRegNumberForColor(int level, String color);
	
	public List<Integer> getSlotNumbersFromColor(int level, String colour);
	
	public int getSlotNoFromRegistrationNo(int level, String registrationNo);
	
	public int getAvailableSlotsCount(int level);
	
	public void doCleanup();
}
