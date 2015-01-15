//completed lab working with Ian Paul 
import java.io.*;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintStream;
import java.util.Scanner;


public class Lab8 
{
	public static int userChoice; 
	public static String file;
	public static String fileName;
	
	public static void main(String[] args)
	{	
		menuPrompt();
		userChoice();
	}
	


	public static void menuPrompt()
	{
		System.out.println("This is a menu:\n\nEnter 1 to begin writing information to a file\nEnter 2 to assign a name to the file\nEnter 3 to write more information to edit a text file");
		
	}
	public static void userChoice()
	{
		Scanner input = new Scanner (System.in);
		userChoice = input.nextInt();
		if(userChoice == 1)
		{
			writeTXT();
		}
		else if (userChoice == 2)
		{
			readFileName();
		}
		else if (userChoice == 3)
		{
			editFileTXT();
		}
	}
	public static void writeTXT()//method for 1.a. 
	{
		try
		{
		//PrintStream fileName = new PrintStream("someOtherFile.txt");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the .txt file name you would like to write on:");
		
		fileName = input.next();
		File f = new File(fileName);
		
		PrintStream myFileWriter = new PrintStream (f); //takes user input, the file name
		
		System.out.println("Now enter a sentence that you would like add to the file:");
		Scanner userSentence = new Scanner (System.in);
		String userSentenceVariable = userSentence.nextLine();
		
		myFileWriter.println(userSentenceVariable);
		
		if(myFileWriter != null)
		{
			myFileWriter.close();//closes printSteam 
		}
	}
	catch(FileNotFoundException e)
	{
		System.out.println("File not found, please try a different name.");
	}
		System.out.println();
		menuPrompt();
		userChoice();
	}
	   
	
	public static void readFileName()//method for 1. b
	{
		System.out.println("Please enter the .txt file that you would like to open and the contents of the file will be printed on the console");
		Scanner input = new Scanner (System.in);
		file = input.next();
		File myFile = new File(file);
		
		try //try catch loop for if the file doesn't exist 
		{
			Scanner myFileReader = new Scanner(myFile); //assigns myFile to myFileReader object using scanner class
			
			while(myFileReader.hasNext()) //grabs lines from text file 
				System.out.println(myFileReader.nextLine()); //prints lines from text file 
			
			//close input to avoid potential memory leaks 
			if(myFileReader != null)
			{
				myFileReader.close();//close input after it is grabbed from file 
			}
		}
		catch(FileNotFoundException e)//catch for when file doesn't exist 
		{
			System.out.println("File not found, please try again.");//printed when file doesn't exist 
		}
		System.out.println();
		menuPrompt();
		userChoice();
	}	

	public static void editFileTXT()//method for 1.c. 
	{
		System.out.println("Enter a sentence that you would like to add to a file:");
		Scanner userSentence = new Scanner (System.in);
		String userSentenceVariable = userSentence.nextLine();
			
		try //some code taken from http://www.mkyong.com/java/how-to-append-content-to-file-in-java/
		{
		System.out.println("Please enter the .txt file name you would like to write on:");
		Scanner input = new Scanner(System.in);
		fileName = input.next();
		File f = new File(fileName);
		if(!f.exists()){
			f.createNewFile();
			
		}
		//true = append file
		FileWriter fileWritter = new FileWriter(f.getName(), true);
		BufferedWriter bufferWritter = new BufferedWriter (fileWritter);
		bufferWritter.write("\n" + userSentenceVariable);
		bufferWritter.close();
		
		System.out.println("Done");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println();
		menuPrompt();
		userChoice();
	}
}
		