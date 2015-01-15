/**  @Author Emma Paul 
 *	 @version .1, 08/011/2013
 *   This is a recursion lab. I referred to multiple web-sites to complete this lab and discussed solutions for exercise 3 with my brother Ian Paul. 
 *   
 */
public class Lab6Recursion 
{
	public static void main (String[] args)
	{
		//Print statements to test method for Exercise 1
		System.out.println("The first fibonacci number (1) value should be 1 if my method is correct: " + fibonacci(1));
		System.out.println("The second fibonacci number (2) value should also be 1 if my method is correct: " + fibonacci(2));
		System.out.println("The 10th fibonacci number (10) value should be 34 if my method is correct: " + fibonacci(9));
		
		//Print statements to test method for Exercise 2 
		String s = "kayak";
		System.out.println("If my method works, \"kayak\" is a palandrome, and my method will return T: " + isPal(s));
		String r = "animal";
		System.out.println("If my method works, \"animal\"  is not a palandrome, and my method will return F: " + isPal(r));
	}
	
	//Exercise 1: Write Java code for a recursive method for computing the Fibonacci sequence. Recall that the
	//Fibonacci sequence is defined as: Fib(1) = 1, Fib(2) = 1, Fib(n) = Fib(n-1) + Fib(n-2) (if n > 2)
	public static int fibonacci(int n) //used this method from http://math.hws.edu/javanotes/c9/ex1-ans.html
	{
		    if ( n == 1 || n == 2 ) //if the number is equal to 0 or 1 (Base Cases)
		    {
		        return 1;//return 1 because the answer for the base cases is 1
		    }
		    else //or else the recursive case is called, which is the fibonacci function 
		    {
		           //the answer is obtained by applying the function recursively to n-1 and to n-2, and adding the two answers.
		        return fibonacci(n-1) + fibonacci(n-2);
		    }
	}
	
	//Exercise 2: Write Java code for a recursive method that determines if a given string is a palindrome. The
	//method should take a string as a parameter and return a boolean.
    //Examples: civic, deed, kayak, deleveled, aibohphobia (the fear of palindromes)
	 public static boolean isPal(String s) //used method from: http://stackoverflow.com/questions/4367260/creating-a-recursive-method-for-palindrome
     {
	        if(s.length() == 0 || s.length() == 1)//base case
	            return true;//returns true to get out of loop when there is 0 or 1 letter left in substring 
	        if(s.charAt(0) == s.charAt(s.length()-1))//checks for first char (s.charAt(0)) and last char s.charAt(s.length()-1)) of String word
	            return isPal(s.substring(1, s.length()-1));//it reruns a smaller (temporary) substring without first and last letters 
	        return false;//returns false if the first and last letters of the string are not the same, ie if the word is not a palindrome
	 }
	 
	 /*Exercise 3: (I discussed solutions with my brother Ian Paul, though I believe developed different solutions in the end)
	  * I would first divide the pile into two piles perfectly split with the same amount of coins. (If there were an uneven amount of coins,
	  *  I would take a coin out to make the two piles even, and if the two piles were perfectly balanced then I'd know that I randomly selected the heaviest coin!)
	  * The heavier pile would  would tell me which pile contains the heavier coin. 
	  * I would then remove the two piles from the scale and take two coins from my lighter pile and put one on either side of the balance scale to make sure the two coins perfectly balanced.
	  * That coin weight would then be my base case, and I would weigh each coin individually from the heavier pile against my base case coin until there was a coin that didn't 
	  * perfectly balance with my base case coin and was heavier, which would tell me that it is the heavier coin I was looking for! 
	  */
	 
}

