package LibraryTDD;

public class Main 
{
	public static void main(String[] args) 
	{
		Library lib = new Library();
		//lib.run();
		
		
		String[][] a = new String[2][];
		a[0] = new String[2];
		a[1] = new String[1];
		
		a[0][1] = "Word";
		
		
		int days = 6;
		int months = 0;
		
		String dateTakenOut = DateTime.formatNewTime("20-01-2019", "dd/MM/yyyy");
		int[] formatedDateTaken = Utility.convertStringToIntArray(dateTakenOut, "/");
		
		formatedDateTaken[0] += days;
		formatedDateTaken[1] += months;
		
		if(formatedDateTaken[0] > 30)
		{
			formatedDateTaken[0] -= 30;
			formatedDateTaken[1] += 1;
		}
		
		if(formatedDateTaken[1] > 12)
		{
			formatedDateTaken[1] -= 12;
			formatedDateTaken[2] += 1;
		}
		
		String currentTime = DateTime.getCurrentTime("dd/MM/yyyy");		
		int[] formatedDateToday = Utility.convertStringToIntArray(currentTime, "/");
		
		if(formatedDateToday[2] <= formatedDateTaken[2])
		{
			if(formatedDateToday[1] <= formatedDateTaken[1])
			{
				if(formatedDateToday[0] < formatedDateTaken[0])
				{
					System.out.println("isLate");
				}
			}
		}
		
		//System.out.println(finalDate);
	}
}
