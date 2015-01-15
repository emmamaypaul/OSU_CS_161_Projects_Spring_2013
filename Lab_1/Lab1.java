
public class Lab1 
{
	public static void main (String[]args)
	{
		//1. Create a program the runs
		System.out.println("This should be a working program now!");
		
		//2.a,b,c Create a program that:
		
		//2.a declares, initializes, and prints two different types of variables 
		//First variable: create a double variable and assign it in the value 1.42
		double myDouble=1.42;		
		//Second variable: create a boolean variable and, as a separate statement, set it to the value true
		boolean theRealDeal;
		theRealDeal=true; 
		System.out.print("This is an integer variable:");
		System.out.println(myDouble);
		System.out.print("This is a boolean variable:");
		System.out.println(theRealDeal);
		
		//2.b.initializes, and prints two types of constants 
		//Two constants to be printed in the program 
		final int FIRST_CONSTANT=55;
		final double SECOND_CONSTANT;
		SECOND_CONSTANT=5.55;
		System.out.print("This is an int constant, i.e. integer number:");
		System.out.println(FIRST_CONSTANT);
		System.out.print("This is a double constant, i.e. decimal number:");
		System.out.println(SECOND_CONSTANT);
		
		//2.c.prints two different types of literals
		//print some literals
		System.out.print("This is a string literal, i.e. text:");
		System.out.println("world peace");
		System.out.print("This is an int literal, i.e. number:");
		System.out.println(100);
		
		/*3.a,b,c Now create a program that uses some variables, constants, or literals 
		 to print values possible for the short and float data types as follows:
		 */
		
		//3.a. try to find the lowest possible value for each of the data types
		//create a variable short value, lowest possible, called myLowShortVariable
		//then assign it the value -32,768
		short myLowShortVariable;
		myLowShortVariable=-32768; 
		System.out.print("This is the lowest possible variable value for short data type:");
		System.out.println(myLowShortVariable);
		//create a constant float value, lowest possible, called myLowFloatConstant
		final float LOWEST_CONSTANT=(float)(-1* Math.pow(-10, 38));
		System.out.print("This is the lowest possible constant value for float data type:");
		System.out.println(LOWEST_CONSTANT);
		
		//3.b try to find the highest possible value for each of the data types
		//create a literal short value, highest possible 
		System.out.print("This is the highest possible literal value for short data type:");
	    System.out.println(32768);
	    System.out.print("This is the highest possible literal value for float data type:");
	    System.out.println(10E38);
	    
	    short maxShortVariableComputed= (short)Math.pow(2,15); 
		System.out.print("This is a computed maximum value for data type short:"); 
		System.out.println(maxShortVariableComputed);
	    
	    
	    
	    //practice for assignment 1 figuring out math function 
	    Integer.toString(-2147483648,2);
	    System.out.println(Integer.toString(-2147483648,2));
	    
	    //System.out.println(Integer.parseInt(8823438,20));
	    
	 
	    
	    System.out.println(Math.pow(2, 3)); 
	    
	   
	    
	}
}


