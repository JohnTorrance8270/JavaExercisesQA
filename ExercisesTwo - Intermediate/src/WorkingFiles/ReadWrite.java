package WorkingFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite 
{
	public static List<String> readLinesFromFile(String filePathway)
	{
		BufferedReader reader = null;
		List<String> lines = new ArrayList<String>();
		
		try
		{
			File file = new File(filePathway);
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			FileReader fileReader = new FileReader(file);
			reader = new BufferedReader(fileReader);
			
			String line = reader.readLine();
			while(line != null)
			{
				lines.add(line);
				line = reader.readLine();
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				if(reader != null)
				{
					reader.close();
				}
			}
			catch(Exception ex)
			{
				System.out.println("Error When Trying To Close BufferReader " + ex);
			}
		}
		
		return lines;
	}
	
	public static void writeToFile(String filePathway, String messageToWrite, boolean addToFile)
	{
		BufferedWriter writer = null;
		
		try 
		{
			File file = new File(filePathway);
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(file, addToFile);
			writer = new BufferedWriter(fileWriter);
			
			writer.write(messageToWrite);
			writer.newLine();
			System.out.println("File Written Successfully");
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				if(writer != null)
				{
					writer.close();
				}
			}
			catch(Exception ex)
			{
				System.out.println("Error When Trying To Close BufferWriter " + ex);
			}
		}
	}
}
