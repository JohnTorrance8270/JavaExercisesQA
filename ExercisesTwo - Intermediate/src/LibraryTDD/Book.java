package LibraryTDD;

public class Book extends Items
{
	protected Book(String name, DamageLevel condition, String author, String publisher, 
			int pageCount, String itemType) 
	{
		super(name, condition, author, publisher, pageCount, itemType);
	}

	@Override
	protected void currentStatus() 
	{
		
		
	}
}
