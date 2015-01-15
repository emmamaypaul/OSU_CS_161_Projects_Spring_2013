
public class Lab5 //(1.a.i.) driver class with main method
{
	public static void main(String[]args)
	{ 
		System.out.println("This program will discuss a dog"); 
		
		//(1.b) create object from helper class (Dog)
		Dog info = new Dog("Taffy", 6); //(1.c and 1.d) this line accesses static information (number of dogs) non-static information (dog name and age)
		
		System.out.println(info);
		
		
	}
}
