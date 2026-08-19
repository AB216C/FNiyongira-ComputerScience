package chapter8WrapperClasses;

import java.util.Scanner;

public class CharacterTest {

	public static void main(String[] args) {
		
		/*
		 * This program demonstrate some of the  Character class's character testing methods
		 */
		
		String inputLine;		// A line of input
		char inputChar;			// A character
		
		//Create a Scanner object for keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Get a character from the user
		
		System.out.println("Enter a character:");
		
		inputLine = keyboard.nextLine();
		
		inputChar = inputLine.charAt(0);
		
		
		//Test the character 
		
		if (Character.isLetter(inputChar)) 
		{
			System.out.println("Entered character is a Letter");
		}

		if (Character.isDigit(inputChar)) 
		{
			System.out.println("Entered character is a digit");
		}
		
		if (Character.isUpperCase(inputChar)) 
		{
			System.out.println("Entered character is an Upper case letter");
		}
		
		if (Character.isLowerCase(inputChar)) 
		{
			System.out.println("Entered character is a lower case letter");
		}
		
		if (Character.isSpaceChar(inputChar)) 
		{
			System.out.println("Entered character is a  space");
		}
		if (Character.isWhitespace(inputChar)) 
		{
			System.out.println("Entered character is a  whitespace");
		}
		
		
		
	}

}
