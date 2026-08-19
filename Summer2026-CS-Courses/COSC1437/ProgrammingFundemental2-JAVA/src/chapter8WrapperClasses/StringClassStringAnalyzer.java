package chapter8WrapperClasses;

import java.util.Scanner;


/*This program display displays the number of latter, digits, and whitespace in characters in a String*/

public class StringClassStringAnalyzer {

	public static void main(String[] args) {
		
		
		String str;	//To hold input as a string
		char[] array;	//To hold the input as an array
		int letters = 0,	//Total number of alphabetic letters
		     digits = 0,		//Total number of digits 
		    whitespaces = 0;		//Total number of whitespace
		
		
		//Create Scanner for a keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Get a string from the user
		

		
		System.out.println("Enter a string");
		
		str = keyboard.nextLine();
		
		//Convert a string to a char array
		
		array = str.toCharArray();
		
		
		//ANALYZE THE CHARACTERS 
		
		for (int i=0; i<array.length; i++)
		{
			if (Character.isLetter(array[i]))
				letters ++;
			else if (Character.isDigit(array[i]))
				digits ++;
			else if (Character.isWhitespace(array[i]))
				whitespaces++;
		}
		
		
		
		//Display the results.
		
		System.out.println("That string contain "+ letters + 
						   " letters " + digits + 
						   " digits and " + whitespaces +
						   " whitespaces");
		
		
		
	}

}
