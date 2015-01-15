

	/******************************************************
	 ** Author: <Student>
	 ** Description: GuessMyCard java program that user guesses and prints random numbers
	 ** Input: user choice of intergers
	 ** Output: “random numbers”
	 ******************************************************/
	import java.util.Scanner;


	public class Code1 {

		public static void main(String[] args)

		{ 
			int selection = 0;
			int randomNumber = 0;
			int lowValue = 0;
			int highValue = 0;
			do
			{
				//Assuming a non-zero random number
				if(randomNumber == 0){
					randomNumber = (int)(Math.random() * 52);
					//Just for testing
					//System.out.println("Random number: " + randomNumber);
					System.out.println("Pick a number from 1 to 52 (inclusive)");
				}

				Scanner input = new Scanner(System.in);
				
				//if(input.hasNextInt()){
					selection = input.nextInt();
				//}
				

				if(selection < randomNumber)
				{
					if(highValue == 0){
						highValue = 52;
					} 
					lowValue = selection;
					System.out.println("Sorry that is too low!");
					System.out.println("pick a number from " + ++lowValue + "-" + highValue);
				}
				if(selection > randomNumber)
				{
					if(selection > 52){
						highValue = 53;
					} else {
						highValue = selection;
					}
					if(lowValue == 0){
						lowValue = 1;
					}
					System.out.println("Sorry that is too high!");
					System.out.println("pick a number from " + lowValue + "-" + --highValue);

				}
				if(selection == randomNumber)
				{
					System.out.println("That is correct!");
					System.exit(0);
				}
			}
		 while(true);

		}
	}

