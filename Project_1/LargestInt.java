

//Sharon Davis helped me assign minimm and maximum values to declared variables using java constants (on discussion board) 
//Cash Stramel helped clarify final constants and variables and how I was doing the assignment wrong by assigning multiple values to variable 

public class Assignment1 
{
	public static void main(String[]args)
	{
		//declare min and max variables of short, int, and long data type and assign minimum and maximum values using java constants 
		
		//create a variable of type int called minIntvariable and assign it minimum value using java constant 
		int minIntVariable= Integer.MIN_VALUE;
		System.out.print("This is the  minimum value of data type int:");
		System.out.println(minIntVariable);
		//create a variable of of type int called maxIntvariable and assign it maximum value using java constant 
		int maxIntVariable= Integer.MAX_VALUE; 
		System.out.print("This is the maximum value of data type int:");
		System.out.println(maxIntVariable); 
		//create a variable of type short called minShortVariable and assign in minimum value using java constant 
		short minShortVariable= Short.MIN_VALUE; 
		System.out.print("This is the minimum value of data type short:");
		System.out.println(minShortVariable); 
		//create a variable of type short called maxShortVariable and assign it maximum value using java constant
		short maxShortVariable= Short.MAX_VALUE; 
		System.out.print("This is the maximum value of data type short:");
		System.out.println(maxShortVariable);
		//create a variable of type long called minLongVaraible and assign it minimum value using java constant
		long minLongVariable= Long.MIN_VALUE; 
		System.out.print("This is the minimum value of data type long:");
		System.out.println(minLongVariable); 
		//create a variable of type long called maxLongVariable and assign it maximum value using java constant 
		long maxLongVariable= Long.MAX_VALUE;
		System.out.print("This is the maximum value of data type long:"); 
		System.out.println(maxLongVariable); 
		
		//compute minimum and maximum values of each data type (Int, Short, and Long) using binary numbers 
		int minIntVariableComputed= (int) (-1*Math.pow(2, 31)); 
		System.out.print("This is a computed minimum value for data type int:"); 
		System.out.println(minIntVariableComputed); 
		int maxIntVariableComputed= (int)Math.pow(2, 31); 
		System.out.print("This is a computed maximum value for data type int:"); 
		System.out.println(maxIntVariableComputed); 
		short minShortVariableComputed= (short)(-1*Math.pow(2, 15)); 
		System.out.print("This is a computed minimum value for data type short:"); 
		System.out.println(minShortVariableComputed); 
		short maxShortVariableComputed= (short)(Math.pow(2,15)); 
		System.out.print("This is a computed maximum value for data type short:"); 
		System.out.println(maxShortVariableComputed); 
		long minLongVariableComputed= (long)(-1*Math.pow(2, 63));
		System.out.print("This is a computed minimum value for data type long:"); 
		System.out.println(minLongVariableComputed); 
		long maxLongVariableComputed= (long) Math.pow(2,63); 
		System.out.print("This is a computed maximum value for data type long:"); 
		System.out.println(maxLongVariableComputed); 
		
		/*assign variable to be the maximum value for each data type (int, short, and long) 
		and add 1 to each variable to show how the variables value turns negative. The program computes a false value, 
		which happens when overflow in a data type occurs. The program computes a value that is truncated to fit into 
		the data type range. I would imagine that the computed value would be positive, but it is negative. Interestingly, 
		the negative output is the result of adding two positive numbers (where their sum is equal to a value that exceeds 
		the data type range), and is called an overflow proper (http://en.wikipedia.org/wiki/Arithmetic_overflow).*/
		System.out.print("This is the result of adding one to the computed maximum value for data type int:");
		System.out.println(maxIntVariableComputed + 1); 
		System.out.print("This is the result of adding one to the computed maximum value for data type short:");
		System.out.println(maxShortVariableComputed + 1);
		System.out.print("This is the result of adding one to the computed maximum value for data type long:");
		System.out.println(maxLongVariableComputed + 1); 
		
		
	
	
	}
}
