
public class lab3 
{
	public static void main(String[]args)
	{
		//1) create a program that runs 
		System.out.println("This is a program that runs!");
		
		//2) create a program that: 
		//a) includes syntax error (commented out below)
		//Syste.out.println("This wouldn't run because "System" is missing an "m" so the compiler can't fun 
		
		//b) includes a logic error that is explained in the output of the program 
		// example taken from error practice lab, having a logic error occur when trying to add a string to a number 
		// resulting in a string output rather than the actual output of the equation 
		System.out.println("4+2=" + 4+2);
		
		//c) includes a runtime error that is taken care of by the program itself 
		//example taken from error practice lab, dividing by 0, creating an exception error message from Java 
		// an error message in the output shows how the program takes care of the error by pointing it out to the programmer
		//rather than a runtime error that compiles so it isn't obvious to the programmer there is an error in the first place 
		System.out.println(1/0);
	}
	
}
