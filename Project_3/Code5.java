/******************************************************
** Program: GuessMyCard.java
** Author: <Student>
** Description:  <Generates random numbers from 1 to 52 for user to guess.>
** Input: <Integers from the user such as 10 or 25>
** Output: <what output is expected when your program is executing properly>
******************************************************/
import java.util.Scanner;

public class Code5 
{
	

	public static void main(String[] args) 
	
	{
		// problem 1, randomly select a number from 1 to 52 inclusive.
		
		int number = (int)(Math.random() * 52) + 1; // generates a random number between 1 and 52
		
		Scanner input = new Scanner(System.in);
		
		
		
		int userInput  = 0;
		do
		{
			int numberOfTries = 0; // the user hasn't played the game yet so number of tries is 0
			int totalNumberOfTries = 10;
			do
			
			{ 
				System.out.println("Guess a number between 1 and 52");
				
				// print the number of tries user has
				System.out.println("You have " + (totalNumberOfTries - numberOfTries) + " tries");
				
				int guess = 0; 
				
				if(input.hasNextInt())
					guess = input.nextInt();
	//			This is to see what the user entered.
	//			System.out.println("You entered:");
	//			System.out.println(guess); 
				
				input.nextLine();
				
				if(guess < number)			
				{
						
					System.out.println("Too Low");
					System.out.println("The number is between " + (guess +1) + "-52");
						
				}
					
				if(guess > number)
					
				{
						
					System.out.println("Too High");
					System.out.println("The number is between 1-" + (guess -1));
						
				}
					
				if(guess == number)
				{
						System.out.println("Correct! You win!");
						
						// print the number of tries it took user to guess the number
						System.out.println("You got it correct in "+ (numberOfTries+1) +" tries");
						break;
				}
				
				numberOfTries++;
	
				if(numberOfTries < totalNumberOfTries)
				{
					System.out.println("Let\'s try again");
				}
			} while(numberOfTries < totalNumberOfTries);
			// print the number of tries user has before exiting. it will be zero always. if it is not there is a problem with the code.
			// this is to tell the user that the game is ending
			System.out.println("You have finished your game. What would you like to do next?");
			System.out.println("[1] Start a new game");
			System.out.println("[2] Exit the game");
			
			
			if(input.hasNextInt())
				userInput = input.nextInt();
			
		} while(userInput != 2);
		
		
		System.out.println("Exiting...");
	}	
}

