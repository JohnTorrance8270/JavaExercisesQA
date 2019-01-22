package Garage;

public class Car extends Vehicle
{	
	boolean hasTintedWindows;
	
	Car(String vehicleColour, int vehicleWheelCount, int engineSize, String vehicleType, boolean hasTintedWindows) 
	{
		super(vehicleColour, vehicleWheelCount, engineSize, vehicleType);
		this.hasTintedWindows = hasTintedWindows;	
	}
}
