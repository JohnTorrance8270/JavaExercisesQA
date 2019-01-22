package PaintWizard;

public class Paint 
{
	private int sizeOfBucket;
	private float cost;
	private int areaCovered;
	private String name;
	
	private int totalCovereage;
	
	Paint(int sizeOfBucket, float cost, int areaCovered, String name)
	{
		this.sizeOfBucket = sizeOfBucket;
		this.cost = cost;
		this.areaCovered = areaCovered * areaCovered;
		this.name = name;
		
		totalCovereage = this.areaCovered * this.sizeOfBucket;
	}
	
	public int getTotalCovereage()
	{
		return totalCovereage;
	}
	
	public float getCost()
	{
		return cost;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "Product for a room of that size is: " + name;
	}
}
