import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class Lab7 
{
	public static void main(String[] args)
	{
		//below is code for exercise 1 of lab 7
	
		//An array of random integers for length 10 
		int[] a = new int[10];
		for (int i = 0; i<a.length; i++)
		{
			Random rand = new Random();
			int random_number = rand.nextInt(1000);
			a[i] = random_number;
			
		}
		
		//An array of random integers for length 100 
		int[] b = new int[100];
		for (int i = 0; i<b.length; i++)
		{
			Random rand = new Random();
			int random_number = rand.nextInt(1000);
			b[i] = random_number;
		}
		
		//An array of random integers for length 1000 
		int[] c = new int[1000];
		for (int i = 0; i<c.length; i++)
		{
			Random rand = new Random();
			int random_number = rand.nextInt(1000);
			c[i] = random_number;
		}
		
		//An array of random integers for length 10000
		int[] d = new int[10000];
		for (int i = 0; i<d.length; i++)
		{
			Random rand = new Random();
			int random_number = rand.nextInt(1000);
			d[i] = random_number;
		}
		
		//An array of random integers for length 100000
		int[] e = new int[100000];
		for (int i = 0; i<e.length; i++)
		{
			Random rand = new Random();
			int random_number = rand.nextInt(1000);
			e[i] = random_number;
		}
		//selection sort for (a)-array of 10 random numbers
		System.out.println(Arrays.toString(a));//prints out array of 10 random elements 
		long before = System.currentTimeMillis();
		Sorting.selectionSort(a);
		long after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//selection sort for (b)-array of 100 random numbers
		before = System.currentTimeMillis();
		Sorting.selectionSort(b);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//selection sort for (c)-array of 1000 random numbers
		before = System.currentTimeMillis();
		Sorting.selectionSort(c);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//selection sort for (d)-array of 10000 random numbers
		before = System.currentTimeMillis();
		Sorting.selectionSort(d);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//selection sort for (e)-array of 100000 random numbers
		before = System.currentTimeMillis();
		Sorting.selectionSort(e);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//bubble sort for (a)-array of 10 random numbers
		System.out.println(Arrays.toString(a));
		before = System.currentTimeMillis();
		Sorting.bubbleSort(a);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//bubble sort for (b)-array of 100 random numbers
		before = System.currentTimeMillis();
		Sorting.bubbleSort(b);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//bubble sort for (c)-array of 1000 random numbers
		before = System.currentTimeMillis();
		Sorting.bubbleSort(c);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//bubble sort for (d)-array of 10000 random numbers
		before = System.currentTimeMillis();
		Sorting.bubbleSort(d);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//bubble sort for (e)-array of 100000 random numbers
		before = System.currentTimeMillis();
		Sorting.bubbleSort(e);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//insertion sort for (a)-array of 10 random numbers
		System.out.println(Arrays.toString(a));
		before = System.currentTimeMillis();
		Sorting.insertionSort(a);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
				
		//insertion sort for (b)-array of 100 random numbers
		before = System.currentTimeMillis();
		Sorting.insertionSort(b);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
				
		//insertion sort for (c)-array of 1000 random numbers
		before = System.currentTimeMillis();
		Sorting.insertionSort(c);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
				
		//insertion sort for (d)-array of 10000 random numbers
		before = System.currentTimeMillis();
		Sorting.insertionSort(d);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
				
		//insertion sort for (e)-array of 100000 random numbers
		before = System.currentTimeMillis();
		Sorting.insertionSort(e);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//merge sort for (a)-array of 10 random numbers
		System.out.println(Arrays.toString(a));
		before = System.currentTimeMillis();
		Sorting.mergeSort(a);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
						
		//merge sort for (b)-array of 100 random numbers
		before = System.currentTimeMillis();
		Sorting.mergeSort(b);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
						
		//merge sort for (c)-array of 1000 random numbers
		before = System.currentTimeMillis();
		Sorting.mergeSort(c);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
						
		//merge sort for (d)-array of 10000 random numbers
		before = System.currentTimeMillis();
		Sorting.mergeSort(d);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
						
		//merge sort for (e)-array of 100000 random numbers
		before = System.currentTimeMillis();
		Sorting.mergeSort(e);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//quicksort for (a)-array of 10 random numbers
		System.out.println(Arrays.toString(a));
		before = System.currentTimeMillis();
		Sorting.quicksort(a);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
								
		//quicksort for (b)-array of 100 random numbers
		before = System.currentTimeMillis();
		Sorting.quicksort(b);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
								
		//quicksort for (c)-array of 1000 random numbers
		before = System.currentTimeMillis();
		Sorting.quicksort(c);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
								
		//quicksort for (d)-array of 10000 random numbers
		before = System.currentTimeMillis();
		Sorting.quicksort(a);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
								
		//quicksort for (e)-array of 100000 random numbers
		before = System.currentTimeMillis();
		Sorting.quicksort(a);
		after = System.currentTimeMillis();
		System.out.println("Took "+ (after-before) +" milliseconds");
		
		//below is code for exercise 2 of the lab 
		//First we are to create an array of random integers for a large length (I choose 100000)
		int numElements = 100000;
		int[] bigArray = new int[numElements];//sets the number of elements of the big array 
		for (int i = 0; i<bigArray.length; i++)// loop for the length of the array 
		{
			Random rand = new Random();//creates a new random object 
			int random_number = rand.nextInt(Integer.MAX_VALUE);//and sets the new variable random_number to an integer from 0 to Integer.MAX_VALUE
			bigArray[i] = random_number;//then sets the value of the element i in the bigArray to that random number 
			//note the creation of the random number occurs in the for loop in order to have a new random number for every element in the array
		}
		
		Lab7 searchTest = new Lab7();//instantiates a new searchTest object in order to use the search method 
		for(int i = 0; i<500; i++)//loop that searches an array for a random index 500 
		{
			System.out.println(searchTest.search(bigArray, getRandom(bigArray)));//this calls the search function to find a random value in the array 
			//and prints all 500 values that the method finds and returns (and prints -1 if the value was not found) 
		}
		
	}
	//got help on this method from Ian Paul 
	//it selects a random element, which I use on my bigArray above 
	public static int getRandom(int[] array)
	{
		int rnd = new Random().nextInt(array.length);//a random number is generated from 0 to the number of elements in the array
		return array[rnd];//returns the random element number 
	}

	//I referenced http://mathbits.com/MathBits/Java/arrays/Searcing.htm for this search method 
	public int search (int a[], int v) //method passes an array and an integer as arguments 
		{
			for(int k = 0; k<a.length; k++)//for the length of the array 
			{
				if(a[k] == v) //if k is equal to the integer v passed 
				return k; //return that value 
			}
				return -1;	//otherwise return -1
		}
}
