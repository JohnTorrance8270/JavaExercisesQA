package PaintWizard;

public class Main 
{
	public static void main(String[] args) 
	{
		PaintWizard paintWizard = new PaintWizard();
		paintWizard.cheapestProductForRoomSize(20);
		paintWizard.productThatWastesLeast(20);
		paintWizard.cheapestProductForAnyRoom();
	}
}
