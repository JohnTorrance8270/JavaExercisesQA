package People;

import java.util.ArrayList;

public class main 
{
	public static void main(String[] args) 
	{
		//peopleArray();
	}
	
	private static People findPerson(String targetName, ArrayList<People> peopleContainer)
	{
		for(People person : peopleContainer)
		{
			if(person.name.equals(targetName))
			{
				return person;
			}
		}
		
		return null;		
	}
	
	private static void peopleArray()
	{
		People Jim = new People("Jim", 36, "OfficeWorker");
		People Jane = new People("Jane", 29, "FireFighter");
		People Zack = new People("Zack", 31, "PowerRanger");
		
		ArrayList<People> peopleContainer = new ArrayList<People>();
		peopleContainer.add(Jim);
		peopleContainer.add(Jane);
		peopleContainer.add(Zack);
		
		for(People person : peopleContainer)
		{
			System.out.println(person);
		}
		
		People targetPerson = findPerson("Zack", peopleContainer);
		System.out.println("Found Person: " + targetPerson.name);
	}
}
