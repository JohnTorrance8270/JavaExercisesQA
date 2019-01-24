package LibraryTDD;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime 
{
	public static String getCurrentTime(String pattern)
	{
		DateTimeFormatter formatDateOutput = DateTimeFormatter.ofPattern(pattern);
		LocalDateTime localdate = LocalDateTime.now();
		
		return formatDateOutput.format(localdate);
	}
	
	public static String formatNewTime(String time, String pattern)
	{
		DateFormat formatDateOutput = new SimpleDateFormat("dd-mm-yyyy");
		Date date = null;
		
		try 
		{
			date = formatDateOutput.parse(time);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}
		
		
		formatDateOutput = new SimpleDateFormat(pattern);
		
		return formatDateOutput.format(date);
	}
}
