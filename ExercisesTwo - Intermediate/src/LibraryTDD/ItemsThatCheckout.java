package LibraryTDD;

public abstract class ItemsThatCheckout extends Items
{
	private final int daysInMonth = 30;
	private int maxCheckout;
	private String dateTakenOut = "Not Taken Out";
	private boolean checkedOut = false;
	
	protected ItemsThatCheckout(String name, DamageLevel condition, String author, 
			String publisher, int pageCount, String itemType, int maxCheckout) 
	{
		super(name, condition, author, publisher, pageCount, itemType);
		this.maxCheckout = maxCheckout;
	}
	
	//public abstract boolean isLate();
	public abstract void dateDueBack(); 
	public abstract void checkedOutStatus();
	
	public boolean isLate()
	{
		int days = (maxCheckout > daysInMonth) ?
		(maxCheckout % daysInMonth) * daysInMonth : maxCheckout; 
		int months = (maxCheckout > daysInMonth) ?
		(maxCheckout / daysInMonth) : 0; 
		
		String currentTime = DateTime.getCurrentTime("dd/mm/yyyy");		
		
		String[] dateTaken = dateTakenOut.split("/");
		//int[] dateTakenFormat = Integer.parseInt(dateTaken);
		
		dateTaken[0] += days;
		dateTaken[1] += months;
		
		return true;
	}
	
	protected int getMaxCheckout() 
	{
		return maxCheckout;
	}

	protected String getDateTakenOut() 
	{
		return dateTakenOut;
	}

	public void setDateTakenOut(String dateTakenOut) 
	{
		this.dateTakenOut = (DateTime.formatNewTime(dateTakenOut, "dd/mm/yyyy"));
	}

	protected void setCheckedOut(boolean checkedOut) 
	{
		this.checkedOut = checkedOut;
	}

	protected boolean isCheckedOut()
	{
		return this.checkedOut;
	}
}
