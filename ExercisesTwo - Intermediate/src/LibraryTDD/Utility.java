package LibraryTDD;

public class Utility 
{
	public static int[] convertStringToIntArray(String elementToAlter, String deliminator)
	{
		String[] splitString = convertStringToStringArray(elementToAlter, deliminator);
		
		int[] convertedString = new int[splitString.length];	
		for(int i = 0; i < convertedString.length; i++)
		{
			convertedString[i] = Integer.parseInt(splitString[i]);
		}
		
		return convertedString;
	}
	
	public static String[] convertStringToStringArray(String elementToSplit, String deliminator)
	{
		return elementToSplit.split(deliminator);
	}
}
