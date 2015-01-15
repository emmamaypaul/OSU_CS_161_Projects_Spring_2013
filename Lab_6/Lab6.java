
import java.util.Scanner;

public class Lab6 
{

	public static int userChoice = 0;
	public static int userGameChoice = 0;
	
	public static void main(String[]args)
	{
		
		//Prompts the user with their program choices.
		programPrompt();//method done by Ian 
		//Takes the user input and runs the program based on their choice.
		userProgramChoice(); //method done by Ian 
		
		
		
		
	}
	
	//References a string in helperClass.java. I did this to get practice and to organize my code.
	public static void programPrompt()
	{
		System.out.println(helperClass.programPrompt());
	}
	
	public static void userProgramChoice()
	{
		Scanner userProgramChoice = new Scanner (System.in);
		int userChoice = userProgramChoice.nextInt();
	
		
		if (userChoice == 1)
		{
			//Added in just in case Emma Paul can't figure out the AI Tic Tac Toe 
			TicTacToeRunner.ticTacToeFromBook();
			//helperClass.ticTacToe();
			
		}
		else if (userChoice == 2)
		{
			CardGuessGame.cardGuessGame();
			//helperClass.guessGame();
		}
		else if (userChoice == 3)
		{
			simpleCalc.simpleCalc();
			//helperClass.calculator();
		}
		
		else if (userChoice == 4)
		{
			MadLib.madLib();
			//helperClass.storyTime();
		}
		
		else
		{
			helperClass.incorrectChoice();
		}
		
	}
	
	
}
