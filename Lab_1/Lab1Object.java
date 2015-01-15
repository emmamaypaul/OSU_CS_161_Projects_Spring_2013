//6. This class holds a single person's information, and is used in the main to create an object 
public class Lab1Object 
{
	private String name;
	private int age; 
	private String gender;
			
	/* 7. constructor method for creating Lab1Helper objects 
	 * @param newName, a name for the new Lab1Helper object
	 * @param newAge, the age of the new Lab1Helper object 
	 * @param newGender, the gender of the new Lab1Helper object 
	 */
	public Lab1Object(String newName, int newAge, String newGender)
	{
	    name = newName;
		age = newAge; 
		gender = newGender; 
	}
	
	/* 7. accessor method for getting a Lab1Helper object's name 
	 * @return name, the name of the Lab1Helper object that this method is called on 
	 */
	public String getName()
	{
		return name; 
	}
	
	/* 7. accessor method for getting a Lab1Helper object's age
	 * @return age, the age of the Lab1Helper object that this method is called on 
	 */
	public double getAge()
	{
		return age; 
	}
	

	//7. method for printing name, age, and gender of object 
	public String toString()
	{
		String result = "The name of my person object is: " + name + "," + 
			"\nThe age of my person object is: " + age + " years old," + 
			"\nThe gender of my person object is: " + gender;
			return result;
	}
	

}
