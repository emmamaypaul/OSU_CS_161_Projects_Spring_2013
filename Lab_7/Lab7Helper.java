
public class Lab7Helper //taken from lab 7 practice
{
	private String dogName; 
	
	private int[] bestYears;
	
	public Lab7Helper(String newdogName, int[] newbestYears)//1.b creates an array of object
	{ 
		dogName = newdogName;
		bestYears = newbestYears;
	}
	public String getdogName() //method for getting dogName
	{ 
		return dogName;
	}
	public int[] getbestYears() //method for getting numberOfDogs
	{ 
		return bestYears;
	}
	public String getbestYearsAsString() //accessor method for turning numberOfDogs into a string
	{ 
		String result = "";
		for (int i = 0; i < bestYears.length; i++) //loop for all the elements in the array numberOfDogs
		{ 
			result = result + bestYears[i];
			if (i< bestYears.length-1)
				result = result + ", ";
		}
		return result;
	}
	
	public String toString()
	{
		String result = "Name of dog: " + dogName + "\nDogs best years: " + getbestYearsAsString();
		return result;
	}
	
	
}
