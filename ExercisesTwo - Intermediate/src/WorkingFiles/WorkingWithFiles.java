package WorkingFiles;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles 
{
	private List<Person> people  = new ArrayList<Person>();
	private List<Person> readPeople  = new ArrayList<Person>();
	private String filePathway = "";
	
	WorkingWithFiles()
	{
		filePathway = "C:/Users/Admin/Desktop/WorkSpaceJavaStart/ExercisesTwo - Intermediate/WorkingWithFilesFile/peopleFile.txt";
		
		people.add(new Person("Jim", 41, "Driver"));
		people.add(new Person("Jane", 28, "School Teacher"));
		people.add(new Person("Ted", 15, "Student"));
		people.add(new Person("Zack", 69, "Tesco Worker"));
		people.add(new Person("Pogo", 78, "Retired"));
	}
	
	public void readPeopleToFile()
	{
		List<String> lines = ReadWrite.readLinesFromFile(filePathway);
		
		for(int i = 0; i < lines.size(); i++)
		{
			String[] personDetails = lines.get(i).split(" ");
			readPeople.add(new Person(personDetails[1], Integer.parseInt(personDetails[3]), personDetails[5]));
		}
	}
	
	public void writePeopleToFile()
	{
		String personDetails = "";
		
		for(int i = 0; i < people.size(); i++)
		{
			personDetails = "Name: " + people.get(i).getName() + " Age: " + people.get(i).getAge() + " Job: " + people.get(i).getOccupation();
			ReadWrite.writeToFile(filePathway, personDetails, (i == 0) ? false : true);
		}
	}

}
