package Garage;

public class Vehicle 
{
	public String type;
	
	private int engineSize;	
	private int wheelAmount;
	private String Colour;
	
	Vehicle(String vehicleColour, int vehicleWheelCount, int engineSize, String vehicleType) 
	{
		Colour = vehicleColour;
		wheelAmount = vehicleWheelCount;
		this.engineSize = engineSize;
		type  = vehicleType;
	}
}
