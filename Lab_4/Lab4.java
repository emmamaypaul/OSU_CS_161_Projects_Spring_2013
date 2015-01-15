//Professor Joseph helped walk me through the steps of this lab to during office hours 
public class Lab4 //a class for my static variables
{
       private static int rangeMinValue = 5; //1.a. class variable that stores a value to represent min value for random number generator
       private static int rangeMaxValue = 10; //1.b. class variable that stores a value to represent max value for random number generator

       public static void setRange(int minValue, int maxValue)//1.c. setRange method
       {
    	 //1.c sets values for the minimum and maximum class variable equal to the arguments passed into this method
    	 rangeMinValue = minValue; 
         rangeMaxValue = maxValue;
       } //end of setRange method

       public static int random() //1.d. random method 
       {
    	   //1.d. returns a random int value between the values stored in the minimum and maximum class variables
    	   int randVal =(int)(Math.random() * (rangeMaxValue - rangeMinValue) + rangeMinValue);
    	   return randVal;
       } //end of random method 
       
 public static void main(String[]args) //1.e. main method 
  {
	 //1.e. states that it will create 10 random values 
	 System.out.println("This program will create 10 random values.");
	 
	 //1.e. sets and prints the minimum and maximum values possible using the class variables 
	 System.out.println("The minimum value possible for my random number generator is: " + rangeMinValue); 
	 System.out.println("The maximum value possible for my random number generator is: " + rangeMaxValue);

    int t; //variable t for tries, to be used in my for loop 
    for(t = 0; t < 10; t++){ //1.e a loop to create 10 random values
      System.out.println(random()); //prints 10 random values using the random method created above 

       }//end of for loop

  }//end of main method  

} // end of class Lab4

