package LibraryTDD;

public abstract class Items 
{
	private DamageLevel condition;
	private String author;
	private String publisher;
	private int pageCount;
	private String name;
	private static int ID; 
	private String itemType;
	
	protected Items(String name, DamageLevel condition, String author,
			String publisher, int pageCount, String itemType)
	{
		ID++;
		
		this.name = name;
		this.condition = condition;
		this.author = author;
		this.publisher = publisher;
		this.pageCount = pageCount;
		this.itemType = itemType;
	}

	protected abstract void currentStatus();

	public DamageLevel getCondition() 
	{
		return condition;
	}

	public void setCondition(DamageLevel condition) 
	{
		this.condition = condition;
	}

	public String getAuthor() 
	{
		return author;
	}

	public String getPublisher() 
	{
		return publisher;
	}

	public int getPageCount() 
	{
		return pageCount;
	}

	public String getName() 
	{
		return name;
	}

	public static int getID() 
	{
		return ID;
	}
	
	public String toString()
	{
		return "The " + itemType + " " + name;
	}
}
