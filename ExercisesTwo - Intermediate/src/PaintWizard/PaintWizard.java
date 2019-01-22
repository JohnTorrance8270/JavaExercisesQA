package PaintWizard;
import java.util.ArrayList;

public class PaintWizard 
{
	ArrayList<Paint> paintOptions = new ArrayList<Paint>();
	
	PaintWizard() 
	{
		setupPaintOptions();
	}
	
	private void setupPaintOptions()
	{
		Paint cheapoMax = new Paint(20, 19.99f, 10, "cheapoMax");
		paintOptions.add(cheapoMax);
		
		Paint AverageJoes = new Paint(15, 17.99f, 11, "AverageJoes");
		paintOptions.add(AverageJoes);
		
		Paint DuluxourousPaints = new Paint(10, 25.00f, 20, "DuluxourousPaints");
		paintOptions.add(DuluxourousPaints);
	}
	
	private ArrayList<Paint> eligiblePaintProducts(int roomSize)
	{
		ArrayList<Paint> eligiblePaints = new ArrayList<Paint>();
		
		for(int i = 0; i < paintOptions.size(); i++)
		{
			if(paintOptions.get(i).getTotalCovereage() >= roomSize)
			{
				eligiblePaints.add(paintOptions.get(i));
			}
		}
		
		return eligiblePaints;
	}
	
	public void cheapestProductForAnyRoom()
	{
		Paint bestCoveragePaint = null;
		
		for(Paint p : paintOptions)
		{
			if((bestCoveragePaint != null) && (bestCoveragePaint.getTotalCovereage() < p.getTotalCovereage()))
			{
				p.getTotalCovereage();
			}
			else
			{
				bestCoveragePaint = p;
			}
		}
		
		System.out.println("The Cheapest for a room of any size is: " + bestCoveragePaint.getName());
	}
	
	public void productThatWastesLeast(int roomSize)
	{
		int amountLeftOver = -1;
		roomSize *= roomSize;
		Paint leastWastefulProduct = null;	
		
		ArrayList<Paint> eligiblePaints = eligiblePaintProducts(roomSize);
		
		for(Paint p : eligiblePaints)
		{
			int amountLeft = p.getTotalCovereage() - roomSize;
			if((amountLeft < amountLeftOver) || (amountLeftOver < 0))
			{
				amountLeftOver = amountLeft;
				leastWastefulProduct = p;
			}
		}
		
		if(leastWastefulProduct != null)
		{
			System.out.println("The Least Wasteful " + leastWastefulProduct);
		}
		else
		{
			System.out.println("No Product Was Suitable");
		}
	}
	
	public void cheapestProductForRoomSize(int roomSize)
	{
		float currentCost = -1;
		Paint cheapestProduct = null;	
		roomSize *= roomSize;

		ArrayList<Paint> eligiblePaints = eligiblePaintProducts(roomSize);
		
		for(Paint p : eligiblePaints)
		{
			if((p.getCost() < currentCost) || (currentCost < 0))
			{
				currentCost = p.getCost();
				cheapestProduct = p;
			}
		}
		
		if(cheapestProduct != null)
		{
			System.out.println("The Cheapest " + cheapestProduct);
		}
		else
		{
			System.out.println("No Product Was Suitable");
		}
	}	
}
