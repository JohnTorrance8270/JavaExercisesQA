package LibraryTDD;

public class Dissertation extends Items
{
	protected Dissertation(String name, DamageLevel condition, String author, 
			String publisher, int pageCount, String itemType) 
	{
		super(name, condition, author, publisher, pageCount, itemType);
	}

	@Override
	protected void currentStatus() 
	{
		
	}

}
