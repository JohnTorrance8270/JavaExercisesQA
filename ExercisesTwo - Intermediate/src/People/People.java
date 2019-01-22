package People;

public class People 
{
	String name;
	int age;
	String jobTitle;
	
	People(String personsName, int personsAge, String personsJobTitle)
	{
		name = personsName;
		age = personsAge;
		jobTitle = personsJobTitle;
	}
	
	public String toString()
	{
		String formatedString = "Name: " + name + " Age: " + age + " Job Title: " + jobTitle;
	
		return formatedString;
	}
}
