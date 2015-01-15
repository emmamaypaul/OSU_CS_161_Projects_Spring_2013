
public class Lab2 
{
	public static void main(String[]args)
	{

	   // 1) create a program that runs 
	   System.out.println("This is a program that runs!"); 	
	
	{
	   // 2) create a program that: 
	
	   // a. demonstrates a problem where parentheses are needed for the arithmetic to evaluate properly 
	   // The order of operations are special on a computer. I found it on this web-site: http://apcswshs.wikispaces.com/Order+of+Operations 
		//The order is: Parenthesis, Exponents, Multiplication, Division, Modulus, Addition, Subtraction 
		
		int a= 6, b=2, c=4; 
		
		System.out.println("\nFor arithmetic statements, the order of operations on a computer are similar to the order of operations in mathematics." +
				"\nIf you wanted a subtraction of c from a, and then a division of that total divided by b,(a-c)/b," +
				"\nyou would have to use parenthesis to specify the subtraction operation needs to happen first." +
				"\nThe values we will use for a,b, and c to show an example of this will be:");
		System.out.printf("\ta: %d,\n\tb: %d,\n\tc: %d\n", a, b, c);
		System.out.printf("For the expression: a-c/b, the divison operation is executed first, so the answer is: "+ (a-c/b));
		System.out.printf("\nBut for the expression: (a-c)/b, the operation inside the parenthesis happens first, so the answer is:"+ ((a-c)/b));
			
		
		
		/*3) Now create a program that uses if statements and loops to print something interesting based on random 
		 	  values from the entire range of short values. Something interesting might include facts about certain numbers 
		 	  or when a number is particularly close to one extreme of the number range or the other. 
		 	  (be sure to have the program print information stating what is going on so that the user of the program 
		 	  knows what is happening.*/
		{
			 
			System.out.print("\n\n");
			System.out.println("The mark of the beast ia a number mentioned in the Book of Revalations (http://en.wikipedia.org/wiki/Number_of_the_Beast).");
			
			int beastNumber=666;
			
			if(beastNumber<665)
				System.out.println("This is not the mark of the beast!");
			else if(beastNumber>665 && beastNumber<667)
				System.out.println("This is the number reffered to as the mark of the beast:"+ beastNumber);
			else 
				System.out.println("This is not the mark of the beast");
		}
		System.out.print("\n\n");
		double randomNumber=666; 
		for(int i=0; i<5; i++)
		{
		randomNumber=Math.random()*2; 
		randomNumber +=10; 
		System.out.println("This is a random number: "+ randomNumber); 
		System.out.println("And a random value from short data type range -32768 to 32767 is:" + (Math.random()*(-32768-32767)+32767));
			
	}
	}
		
	}
}



//This website reminded me that I needed to use the java.util.Random class and import the statement before the start of the program class
//(http://java.about.com/od/javautil/a/randomnumbers.htm)
import java.util.Random; 
import java.util.Scanner;

public class Assignment2GuessMyCard 
{
	public static void main(String[]args)
	{
		//The two lines of the program below selects a random number from 1 to 52 (inclusive). I used the method from pg 251 in our book.
		Random generator = new Random();
		int programPickedNumber=generator.nextInt(52) + 1;
		System.out.println(programPickedNumber);
		
		//declare variable for user input
		int guessedUserNumber;
		
		//This line below takes the value from the user and assigns it to the variable guessedUserNumber
		Scanner input=new Scanner(System.in);
		
		int minBound=1; //TA Kyle helped me realize I could make min and max bound variables 
		int maxBound=52; //These will be used shorten the range the user needs to pick from based on their responses
		int t; // variable t= number of tries the user gets;
		
		
		do{
			for(t=0; t<5; t++){
			//The line below asks the user to pick a number from 1-52
			System.out.print("Pick a number from " + minBound + "-" + maxBound + ":");
			guessedUserNumber=input.nextInt(); 
		
		if (guessedUserNumber==programPickedNumber){
			System.out.println("Narley dude, you guessed the right number!:"+ guessedUserNumber);
		}
			
		else if (guessedUserNumber>=minBound && guessedUserNumber<programPickedNumber){
			//if (guessedUserNumber>=1 && guessedUserNumber<programPickedNumber){
			System.out.print("Sorry, that is too low. Pick a number from " + (guessedUserNumber+1) + "-52:");	
			minBound=guessedUserNumber+1;
			}
		else if (guessedUserNumber<=maxBound && guessedUserNumber>programPickedNumber){
			System.out.print("Sorry, that is too high. Pick a number from 1" + (guessedUserNumber-1) + ":");
			maxBound=guessedUserNumber-1; 
			}
		  // else {
		  // System.out.println("You guessed the right number:"+ guessedUserNumber);
			}
		

		/* else if(guessedUserNumber<=maxBound && guessedUserNumber>programPickedNumber){
			if (guessedUserNumber<=maxBound && guessedUserNumber>programPickedNumber){
				System.out.print("Sorry, that is too high. Pick a number from 1- " + (guessedUserNumber-1) + ":");
				//guessedUserNumber=input.nextInt();
				maxBound=guessedUserNumber-1; 
			}
			else if (guessedUserNumber>=minBound && guessedUserNumber<programPickedNumber){
				System.out.print("Sorry, that is too low. Pick a number from " + (guessedUserNumber+1) + "-52");
				//guessedUserNumber=input.nextInt();
				minBound=guessedUserNumber+1; */
		{
		}
		while (t == 5 && guessedUserNumber!= programPickedNumber) //Kyle assisted with this line instead of using an else statement
			System.out.println("Major bummer dude, you ran out of tries!");
	
		 
	
		{
			//System.out.println("Major bummer dude, you ran out of tries!");
	}
	
	
	}	

}


