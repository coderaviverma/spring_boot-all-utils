/**
 * 
 */
package com.example.demo.LLD.gojekparkinglot.dao.impl;

import com.example.demo.LLD.gojekparkinglot.dao.ParkingDataManager;
import com.example.demo.LLD.gojekparkinglot.dao.ParkingLevelDataManager;
import com.example.demo.LLD.gojekparkinglot.model.Vehicle;
import com.example.demo.LLD.gojekparkinglot.model.strategy.NearestFirstParkingStrategy;
import com.example.demo.LLD.gojekparkinglot.model.strategy.ParkingStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MemoryParkingManager<T extends Vehicle> implements ParkingDataManager<T>
{
	private Map<Integer, ParkingLevelDataManager<T>> levelParkingMap;
	
	@SuppressWarnings("rawtypes")
	private static MemoryParkingManager instance = null;
	
	@SuppressWarnings("unchecked")
	public static <T extends Vehicle> MemoryParkingManager<T> getInstance(List<Integer> parkingLevels,
			List<Integer> capacityList, List<ParkingStrategy> parkingStrategies)
	{
		// Make sure the each of the lists are of equal size
		if (instance == null)
		{
			synchronized (MemoryParkingManager.class)
			{
				if (instance == null)
				{
					instance = new MemoryParkingManager<T>(parkingLevels, capacityList, parkingStrategies);
				}
			}
		}
		return instance;
	}
	
	private MemoryParkingManager(List<Integer> parkingLevels, List<Integer> capacityList,
			List<ParkingStrategy> parkingStrategies)
	{
		if (levelParkingMap == null)
			levelParkingMap = new HashMap<>();
		for (int i = 0; i < parkingLevels.size(); i++)
		{
			levelParkingMap.put(parkingLevels.get(i), MemoryParkingLevelManager.getInstance(parkingLevels.get(i),
					capacityList.get(i), new NearestFirstParkingStrategy()));
			
		}
	}
	
	@Override
	public int parkCar(int level, T vehicle)
	{
		return levelParkingMap.get(level).parkCar(vehicle);
	}
	
	@Override
	public boolean leaveCar(int level, int slotNumber)
	{
		return levelParkingMap.get(level).leaveCar(slotNumber);
	}
	
	@Override
	public List<String> getStatus(int level)
	{
		return levelParkingMap.get(level).getStatus();
	}
	
	public int getAvailableSlotsCount(int level)
	{
		return levelParkingMap.get(level).getAvailableSlotsCount();
	}
	
	@Override
	public List<String> getRegNumberForColor(int level, String color)
	{
		return levelParkingMap.get(level).getRegNumberForColor(color);
	}
	
	@Override
	public List<Integer> getSlotNumbersFromColor(int level, String color)
	{
		return levelParkingMap.get(level).getSlotNumbersFromColor(color);
	}
	
	@Override
	public int getSlotNoFromRegistrationNo(int level, String registrationNo)
	{
		return levelParkingMap.get(level).getSlotNoFromRegistrationNo(registrationNo);
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}
	
	public void doCleanup()
	{
		for (ParkingLevelDataManager<T> levelDataManager : levelParkingMap.values())
		{
			levelDataManager.doCleanUp();
		}
		levelParkingMap = null;
		instance = null;
	}
}
