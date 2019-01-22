package Garage;

public class Bus extends Vehicle 
{
	int capacity;
	
	Bus(String vehicleColour, int vehicleWheelCount, int engineSize, String vehicleType, int capacity) 
	{
		super(vehicleColour, vehicleWheelCount, engineSize, vehicleType);
		this.capacity = capacity;
	}
}
