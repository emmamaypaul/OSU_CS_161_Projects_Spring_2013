import java.util.*;


//1. program that excepts user input for tracking their name, age, and gender 
public class Lab1 
{
	//how to set nameInput to name?
	public static String name; //2. String to keep track of user input for person's name
	public static int age;//2. int to keep track of user input for person's age
	public static String gender; //2. String to keep track of user input for person's gender
	
	public static void main (String[]args)
	{

		Lab1Object personInfo= new Lab1Object("Fred", 32, "M");
		System.out.println(personInfo);
		
		getName();
		getAge();
		getGender();
		
		System.out.println("Your name is: " + name +
				"\nYour age is: " + age +
				"\nYour gender is: " + gender);
	
	}
	
	
	public static void getName()
	{
		System.out.print("\nPlease enter your name: ");//4. print statement to get user name
		Scanner input = new Scanner(System.in);
		String nameInput = input.nextLine();
		name = nameInput;
	}
	
	public static void getAge()
	{
		System.out.println("Please enter you age: ");//4. print statement to get user age
		Scanner input2 = new Scanner(System.in);
		int ageInput = 0;
		 //3. loops to detect when user enters improper data (when something other than an int is entered for age)
		boolean ageisnotset = true;
		while(ageisnotset == true) 
		{
		try //this block just says if the age input is an int, then set the while loop to false, which takes the program out of the 
		//try catch loop and sets the age input to the variable age. 
			{
			   ageInput = input2.nextInt();
			   ageisnotset = false;
			}
		catch(InputMismatchException ex)//this line of code happens if the age input is not an int 
			{
				System.out.println("Please enter your age as an integer: ");//exception line executes 
				ageisnotset = true; //the while loop is set to true again so it can be executed another time 
				input2.next();//this line gets rid of bad input 
			}	
		 }
		age = ageInput; //this line is executes when the loop has been set to false because the user input was an int 
		//and sets the user input to the age variable 
		
	}
	
	public static void getGender()
	{
		System.out.print("Please enter your gender: ");//4. print statement to get user gender
		Scanner input3 = new Scanner(System.in);
		String genderInput = input3.next();
		//3. loops to detect when user enters improper data (when something other than a char is entered for gender)
		while(!(genderInput.equalsIgnoreCase("m") || genderInput.equalsIgnoreCase("f"))) //got help from my tutor Lewis Coates (PSU tutor) for the equalsIgnoreCase part
			//which is something I had never learned before but is a feature in java 
			//it means that if the user enters something that is not an m or an f (whether it is capitalized or not), then the exception is thrown 
		{
			System.out.println("Please enter either f or m");
			genderInput = input3.next();//this gets rid of bad input 
			
		}
			gender = genderInput; //when the user enters either "m" or "f" this line is executed and their input is set to the gender variable
	
	}
	
}
