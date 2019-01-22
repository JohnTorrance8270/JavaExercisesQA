package Garage;

public class Motorcycle extends Vehicle
{
	boolean isWearingHelmet;
	
	Motorcycle(String vehicleColour, int vehicleWheelCount, int engineSize, String vehicleType, boolean isWearingHelmet) 
	{
		super(vehicleColour, vehicleWheelCount, engineSize, vehicleType);
		this.isWearingHelmet = isWearingHelmet;
	}
}
