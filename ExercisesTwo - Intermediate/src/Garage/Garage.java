package Garage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage
{
	List<Vehicle> vehiclesInGarage;
	
	Garage()
	{
		vehiclesInGarage = new ArrayList<Vehicle>();
		populateGarage();
	}
	
	private void populateGarage()
	{
		Vehicle car = new Car("Blue", 4, 3, "Car", true);
		addVehicle(car);
		
		Vehicle bus = new Bus("Red", 4, 6, "Bus", 40);
		addVehicle(bus);
		
		Vehicle bike = new Motorcycle("Black", 2, 2, "Bike", false);
		addVehicle(bike);
	}
	
	private void addVehicle(Vehicle vehicle)
	{
		vehiclesInGarage.add(vehicle);
	}
	
	public void removeVehicle(String targetTypeToRemove)
	{
		Iterator cycleVehicles = vehiclesInGarage.iterator();
		while(cycleVehicles.hasNext())
		{
			Vehicle vehicle = (Vehicle)cycleVehicles.next();
			if(vehicle.type.equals(targetTypeToRemove))
			{
				cycleVehicles.remove();
			}
		}
	}
	
	public void fixVehicle()
	{
		for(Vehicle vehicle : vehiclesInGarage)
		{
			int cost = billCalculator(vehicle.type);
			System.out.println("It will cost: " + cost + " to fix this " + vehicle.type);
		}
	}
	
	private int billCalculator(String vehicleType)
	{
		int bill = 0;
		switch(vehicleType)
		{
			case "Car":
			bill = 160;
			break;
			case "Bus":
			bill = 500;
			break;
			case "Bike":
			bill = 80;
			break;
			default:
			bill = 300;
			break;
		}
		
		return bill;
	}
	
	public void emptyGarage()
	{
		vehiclesInGarage.clear();
	}
}
