
import javax.swing.JFrame; //to get graphic frame 
import javax.swing.JTextField; //to layout text field 
import java.awt.GridLayout;//imports layout manager for frame 
import javax.swing.JButton; //imports a button 
import java.awt.event.ActionListener;//allows program to listen to action 
import java.awt.event.ActionEvent; //action event occurs whenever an action is perform by the user 
import javax.swing.JPanel; //this is to have a layout where the sum button isn't adding a row at the bottom 
							//using control panels 
import java.awt.BorderLayout;//to import a boder 

public class Lab9SpreadSheet extends JFrame //we want to be able to use a number of things into the JFrame class, but we want to make our own GUI that runs inside it.
			//this is just another way of saying we wish to inherit properties (such as methods and variables) from the JFrame class. 
			//The object we create can be called a subclass of JFrame. 
		
{
	int height; //in order to easily change how many text field I display later
	//I will start by using an int variable called height and set it to the number of text fields 
	//will make up the entry portion of this simple spreadsheet column, let's use 5 to start 
	//(later we will accept this value from the constructor (the values of height and width (5,5) are declared in driver class 
	//so we just have to initialize it 
	
	int width;
	
	//array of 6 JTextFields, 5 for input and 1 for the total, using my height variable + 1 to 
	//determine that number 	
	JTextField[][] cells; //= new JTextField[height + 1][width]; //the + 1 is for the "total" field at the end 
	
	public Lab9SpreadSheet( int newHeight, int newWidth) //object, subclass of frame, idk about the int newHeight or int newWidth
	{
		height = newHeight;
		width = newWidth; 
		cells = new JTextField[height + 1][width]; //the + 1 is for the "total" field at the end 
		
		
		setSize(300,300); //sets size of window to 200 by 200 pixels 
		setTitle("A Spreadsheet, fill in values in the calls and watch the column and rows totals increat");//sets title
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);//sets the default operation that happens when you close 
		//the application (which is not neccesary on super simple programs like the one we are using, 
		//but can come in handy with more complex GUI based applications 
		
		//this is removed so we can make the grid look the same without the sum box adding a row: setLayout(new GridLayout(height + 2, width));//sets layout of field array, + 1 (for the total row)
		
		//create panels for storing graphical components 
		//this layout uses a main JPanel with a grid layout with two rows and one column, the top row holds a JPanel with just the button in it, the bottom row holds another JPanel 
		//using a GridLayout with all the text fields in it 
		JPanel mainPanel = new JPanel(new BorderLayout()); //GridLayout(2, 1)); //object has 2 rows and one column 		
		JPanel buttonPanel = new JPanel(); //using the default layout manager(just holding one button, but could be used to hold more buttons that do other actions)
		buttonPanel.setSize(0,0);
		JPanel cellPanel = new JPanel(new GridLayout(height + 1, width));//this is how we had it above (earlier) before adding other JPanels
		
		//add sub-panels to main panel 
		mainPanel.add(buttonPanel, BorderLayout.NORTH);
		mainPanel.add(cellPanel, BorderLayout.CENTER);
		
		//add main panel to frame 
		this.add(mainPanel);//this adds the two lines from above (ie the buttonPanel and the cellPanel) to the mainPanel, ie withint the main panel frame 
		
		//set button above cells array 
		JButton sumButton = new JButton("Sum!");
		
		
		sumButton.addActionListener(new SumActionListener());//create and add an instance of the action listener to the button 
		//so that it knows what to execute when it gets clicked on.
		//this.add(sumButton);//adds button 
		
		buttonPanel.add(sumButton);//this adds my button to my buttonPanel instead of directly to the frame 
		//the butonPanel gets as much space as the cell panel, and this can be fixed by using a different layout 
		//GridLayout tries to make the sizes of the areas be equal by default 
		//I would recommend the BorderLayou to fix this problem (create the main panel using a border layout, 
		//and set the button panel and cell panel to north and center of the border layout respectively
		
		
		JButton resetButton = new JButton("Reset");//1.a for a reset button!!! 
		
		resetButton.addActionListener(new ResetActionListener());
		
		buttonPanel.add(resetButton);
		
		//this whole for loop below allows us to initialize all the "cells" array with some initial values and disable
		//the last row to later use it as a total row 
		//Also, this for loop is so we can visit each column in a row for each row 
		////done this way because when I add something to the grid layout it adds it as its next 
		//available position in a row, I can't change the way these get added to the grid, so I add all the normal cells as I go
		//then check to see if I am adding the last row so that I can disable the "total" text fields

		for(int i = 0; i<height + 1; i++)//using a for loop we can create text fields to fill array
		{
			for(int j = 0; j<width; j++)//the nested loops is to visit each of the normal cells and place the total into the 
				//the total row at the bottom of each column 
			{
				cells[i][j] = new JTextField("0");//adding text field 
				cellPanel.add(cells[i][j]);
			/*
			 * Notice that I am creating the text fields with the string Ò0Ó, this i
		s because JTextFields only take Strings, but you will have a way of extracting out the numbers from that string using the
		Integer.parseInt method and a little error checking (we do not want to try to add strings and
		numbers after all), so no need to worry
		too much.
			 */
			//this.add(cells[i][j]);
			cellPanel.add(cells[i][j]);//this adds text fields to the cellPanel instead of the frame 
			/*
			 * You do not have to use the keyword ÒthisÓ to call the add method, but I chose to put it
	there to make it obvious that I meant to add to the frame and not some other object that I
	forgot to type (not using ÒthisÓ is fine, but other programers may come along, read your code,
	and consider whether you meant to add the component to another object and just left out the
	name of the object and the '.' before the add method call)
			 */
		//disable the ones being user for holding the totals 
			if(i==height)
				cells[height][j].setEnabled(false);
			  //we want to disable the 6th text field (which is why there is no +1 after height, because I want to only 
		//display the total of the other 5 (which is height) (rather than allowing the total to be edited by hand)
	//by enabling height, the first 5 cells "0's" can be changed but the 6th cant and it gray and blocked from user
			}
		}
		}	
	 //private listener to calculate totals of columns and rows of a SpreadSheet object
	 //private class because I do not intend to use it outside this class for now 
	private class SumActionListener implements ActionListener //implement because I want to meet the
	//method requirements of being an ActionListener so I can then attach this listener to objects 
	//so that they will run this code when they get used (button gets clicked for example and run the code 
	//in their attached action listener 
	{
		public void actionPerformed(ActionEvent event)//method that gets called when an action listener is 
		//activated by the objects with this listener attached
		{
			double columnSum = 0; //declare and initialize column sum variable that is the running total of the column which gets set into the 
			//last text field after we are done adding values up 
			
			/* Notice that I am doing the outer loop by what we might think of at the column, this is because I know if I do it 
			 * this way I can visit each "total" text field right after I visit the rest in the column without doing 
			 * any extra work 			 * 
			 */
			
			for(int j=0; j< width; j++)//loop for tracking which column we are adding in 
			{
				columnSum =0;//reset column sum when we plan to move to the next column 
				
				for(int i = 0; i< height; i++)//loop for tracking which row in a column we are on 
					//that runs through the height of the column trying to add 
				//values together
				{
					
				//the try catch in my for loop is important, I need it because I can't pull out a number if
				//there is text inside the text field, so I chose to catch these 
				//exceptional cases and just not count them as part of my total 
				//for example, if I write "four" rather than 4 in one box and 5 in anther, the console will print "Error...."
				//and then the sum would be 5 
				try
				{
					columnSum += Double.parseDouble(cells[i][j].getText());
				}
				catch (Exception e)
				{
					System.out.println("Error encountered while parseing String:" + cells[i][j].getText());
					
					System.out.println("Skipping cell: (" + i + ")");
					
				}
				
			}
			
			cells[height][j].setText(""+ columnSum);//set value of the last cell in the column (the total text field)
		    }
	
	      }
     }
	//1.b have an ActionListener that will reset the contents of all the cells in the SpreadSheet to 0
	private class ResetActionListener implements ActionListener //implement because I want to meet the
	//method requirements of being an ActionListener so I can then attach this listener to objects 
	//so that they will run this code when they get used (button gets clicked for example and run the code 
	//in their attached action listener 
	{
		public void actionPerformed(ActionEvent event)//method that gets called when an action listener is 
		//activated by the objects with this listener attached
		{
					
			double columnSum = 0; //declare and initialize column sum variable that is the running total of the column which gets set into the 
			//last text field after we are done adding values up 
			
			/* Notice that I am doing the outer loop by what we might think of at the column, this is because I know if I do it 
			 * this way I can visit each "total" text field right after I visit the rest in the column without doing 
			 * any extra work 			 * 
			 */
		
			
			
			for(int j=0; j< width; j++)//loop for tracking which column we are adding in 
			{
				columnSum =0;//reset column sum when we plan to move to the next column 
				
				for(int i = 0; i< height; i++)//loop for tracking which row in a column we are on 
					//that runs through the height of the column trying to add 
				//values together
				{
				//the try catch in my for loop is important, I need it because I can't pull out a number if
				//there is text inside the text field, so I chose to catch these 
				//exceptional cases and just not count them as part of my total 
				//for example, if I write "four" rather than 4 in one box and 5 in anther, the console will print "Error...."
				//and then the sum would be 5 
				try
				{
					//columnSum += Double.parseDouble(cells[i][j].getText());
					cells[i][j].setText("0");//this is the important line I figured how to make the cells reset to 0
					
				}
				catch (Exception e)
				{
					System.out.println("Error encountered while parseing String:" + cells[i][j].getText());
					
					System.out.println("Skipping cell: (" + i + ")");
					
				}
				
			}
			
			cells[height][j].setText("0" );// + // columnSum);//set value of the last cell in the column (the total text field)
		    }
	
	      }
     
	
	      
     }
}





/* If you really want to get into some good GUI design objects to expand your SpreadSheet you might consider 
 * 1. adding a listener to each of the JTextField objects so that they know when they gain focus it will select the current contents of the text field 
 * 2. having a method that will automatically update the sum of the colum when the contencts of a text field changes 
 * 3. add an extra column to the spreadsheet so you can get totals of rows as well as totals of columns 
 * 4. add extra buttons to perform different operations on the data in the text fileds like averaging all the values, or finidng the min or max values 
 * 5. You might add check-boxes above each column or before each row to denote which columns or rows are to be considered in a calculation (include or exculde a column or row) 
 * 
 */