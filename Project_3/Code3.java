	
import java.util.Scanner;

public class Code3
{
	public static void main(String[] args) 
		{// TODO Auto-generated method stub
			int again = 1;
			do
			{			
					int value = (int)(Math.random() * 52);  //computer sets random # to int value
					Scanner input = new Scanner(System.in);  //allows input from user
					int selection = 0;						// declares int selection for, used for user input
					
					System.out.println("Please select an option from the following menu: ");		//prints out instructions for user to input certain data
					System.out.println("[1] Play, guess a number between 1 and 52 (inclusive)");
					System.out.println("[2] Quit program");
					System.out.println("Enter your choice (1 or 2): ");
					
					if(input.hasNextInt())						//puts user input into int selection
						selection = input.nextInt();
					while(selection != 1 && selection != 2)		//tests that user input is in range
					{
					System.out.println("That is not a valid entry. Please enter 1 or 2: "); //lets user know input out of range
					if(input.hasNextInt())
						selection = input.nextInt();			//puts user input into int selection
					else
						input.nextLine();   // clear line in scanner object
					}
					if(selection == 2)  // if user input is 2, performs associated action of quitting
					{
						System.out.println("You entered a 2, now quitting.");
						System.exit(0);
					}
					if(selection == 1)  // if user input is, performs associated action of asking for random # input
						do
						{			
							System.out.println("Enter a number between 1 and 52 (inclusive): "); //asks for guess from user
							if(input.hasNextInt())
								selection = input.nextInt();	//puts user input into int selection
							if(selection < 1 || selection > 52) //tests user input is in range
								System.out.println("Invalid entry."); //outputs when user input out of range
						}while(selection < 1 || selection > 52);  //repeats do/while loop until input is in range
					if(selection != value) //tests if input is same as random value
						do
						{	
							if(selection < value)  //if user input is less than random value, following action performed
								do
								{
										System.out.println("You are too low, guess again: "); //tells user guess was too low, and to guess again
									if(input.hasNext())
										selection = input.nextInt();  //puts user input into int selection
								}while(selection < value);	 //repeats do/while loop until input isn't less than random value
							if(selection > value) // if user input is more than random value, following action performed
								do
								{
										System.out.println("You are too high, guess again: "); //tells user guess was too high, and to guess again
									if(input.hasNextInt())
										selection = input.nextInt();  //puts user input into int selection
								}while(selection > value);  //repeats do/while loop until input isn't more than random value
						}while(selection != value);  //repeats do/while loop until input is equal to random value
						
							if(selection == value) //if input equals random value, performs following action
								System.out.println("Correct! You entered: " + selection + ". Enter 1 for menu: "); //tells user they have guessed correctly and asks for input
					do{
						if(input.hasNextInt())
							again = input.nextInt(); //puts user input into int again
						else
							input.nextLine(); //clear line in scanner object
						if(again !=1)  //if again doesn't equal 1 then performs following action
							System.out.println("Sorry, that is not a valid answer. Enter 1 for menu: "); //tells user they gave invalid entry, asks for input of 1
					} while(again != 1); // repeats do/while loop until user enters input of 1
			}while(again == 1); //input equals 1, begins do/while loop again, which loops to beginning of program
		}}