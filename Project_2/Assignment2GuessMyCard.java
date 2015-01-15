/*
Program: Assignment2GuessMyCard.java
Author: Emma Paul 
Date: April 25, 2013 
Description: This program generates a random number from 1-52 (inclusive). It then asks the user to guess that random number from 1-52. 
			If the user guesses the right number the program tells them so. If the user guesses too high or too low, the program then asks the user to keep guessing, 
			shortening the range to guess from based on the users previous guesses. After the user's fifth try without success, the program prints they have ran out of tries.
			It also prompts the user to input an integer from 1-52 if they input an error number, which in this case is if they do not print an integer or print a number outside the range of 1-52. 
Input: The input necessary for the program to execute properly is a random number generated, a loop for five tries, a loop for the programmer to eventually guessed the random number,
       a loop for catching error, and the user input. 
Output: The output is the different prompts to the user throughout the program, first asking them to pick a n number between 1-52 (inclusive), 
        then based on their answer, telling them whether they guessed the right random number, or whether their number was too high or too low, 
        and as they get closer to the number, the output prompt asks them to choose from a smaller and smaller range bases on their previous guesses. 
        If they run out of five tries the output printed on the console tells them so. 
*/



//This website reminded me that I needed to use the java.util.Random class and import the statement before the start of the program class
//(http://java.about.com/od/javautil/a/randomnumbers.htm). I ended up using any class from java library for errors as well, so I then omitted the java.util.Random class
import java.util.*;//taken from lecture on error handling 


public class Assignment2GuessMyCard 
{
	public static void main(String[]args)
	{
		//The two lines of the program below selects a random number from 1 to 52 (inclusive). I used the method from pg 251 in our book.
		Random generator = new Random();
		int programPickedNumber=generator.nextInt(52) + 1;
		
		//declare variable for user input
		int guessedUserNumber = 0; //Kyle helped me initialize the variable and showed me stack overflow sites to help explain why
		
		//This line below takes the value from the user and assigns it to the variable guessedUserNumber
		Scanner input=new Scanner(System.in);
		
		int minBound = 1; //TA Kyle helped me realize I could make min and max bound variables 
		int maxBound = 52; //These will be used shorten the range the user needs to pick from based on their responses
		int t; // variable t= number of tries the user gets;
		
		for(t=0; t<5; t++){
			//The line below asks the user to pick a number from 1-52
			System.out.print("Pick a number from " + minBound + "-" + maxBound + ":");
	
		//the code below is for handling user error, taken from lecture on handling errors 
		while (true){ //done by Emma
			try{
				guessedUserNumber=input.nextInt();
				if(guessedUserNumber<1 || guessedUserNumber>52){
					throw new IllegalArgumentException();
				}	
				break;
			}
			catch(InputMismatchException ex){ //this discards input that is not an integer
				System.out.println("You must use an integer value!");
				System.out.print("Please enter an integer between:" + minBound + "-" + maxBound + ":");//Kyle helped me realize I needed to use minBound and maxBound variables in case user guessed out of range
				input.next();//discards bad input
			}
				
			catch(IllegalArgumentException ex){//this discards input that is out of the range 1-52
					System.out.println("Invalid response!");
					System.out.print("Please enter an integer between:" + minBound + "-" + maxBound + ":");
			}
		}
		if (guessedUserNumber==programPickedNumber){
			System.out.println("Narley dude, you guessed the right number!:"+ guessedUserNumber);
			break;//to leave the loop when the guessedUserNumber is correct
		}
		else if (guessedUserNumber>=minBound && guessedUserNumber<programPickedNumber){
			System.out.print("Sorry, that is too low. "); 	
			minBound=guessedUserNumber+1;
			}
		else if (guessedUserNumber<=maxBound && guessedUserNumber>programPickedNumber){
			System.out.print("Sorry, that is too high. "); 
			maxBound=guessedUserNumber-1; 
			}
		}
		if (t == 5 && guessedUserNumber != programPickedNumber) { //Kyle assisted me with this line so that there would be a break in the loop
			System.out.println("Major bummer dude, you ran out of tries!");
			}
		
		}
	}


