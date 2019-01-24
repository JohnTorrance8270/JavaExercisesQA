package LibraryTDD;

public class Journal extends ItemsThatCheckout
{
	protected Journal(String name, DamageLevel condition, String author, String publisher, 
			int pageCount, String itemType, int maxCheckoutLength) 
	{
		super(name, condition, author, publisher, pageCount, itemType, maxCheckoutLength);
	}

	@Override
	protected void currentStatus() 
	{
		
	}

	@Override
	public boolean isLate() 
	{
		return false;
	}

	@Override
	public void dateDueBack() 
	{
		
		
	}

	@Override
	public void checkedOutStatus() 
	{
		
		
	}
}
