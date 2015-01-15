//import java.util.Arrays;
//This is mimicked after the array practice lab 

public class Lab7 {
	
	public static int array[];
	
	public static void main(String[]args)
	{ 
		//1.a. create an array of primitives, fill it with data, and prints the data 
		int[] arrayPrimitive = {1, 2, 4, 4, 5};
		
		for( int i=0; i< arrayPrimitive.length; i++)
		{
			System.out.printf("\tvalue at indect %d: %d\n", i, arrayPrimitive[i]);
		}
		
		//1.b. create an array of objects, fill it in, and print the values stored in those objects 
		Lab7Helper dog1 = new Lab7Helper("Taffy", new int[]{1, 3, 7}); //1.d. a method that creates a new array 
		Lab7Helper[] dogs = {dog1, new Lab7Helper("Sammy", new int[] {4, 5, 6})};
		
		for (int i = 0; i< dogs.length; i++)
		{
			System.out.printf("value at index %d:\n\t%s\n", i, dogs[i]);
		}
		

		//changeArray();
	}
	
	//1.c. an array that is passed to a method that alters the array directly 
	public static void changeArray()
	{
		array[0] = 42;
	}
		
		
		
//Question 2 is in ClipPractice.java. Unfortunately I don't understand how accepting command line arguments is supposed to work 
//since the tutorial doesn't make any sense to me since it doesn't appear to actually decide anything. 
		
		
		
	
}
