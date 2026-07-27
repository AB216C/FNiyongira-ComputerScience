package chapter42RelationalOperators;

import java.util.Scanner;

public class SwitchWithNoBreak {

	public static void main(String[] args) {
		
		
		String input;
		char choice;
		
		
		// Create scanner object to get input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		// College input from users
		
		System.out.println("Enter letter A, B, C or D: ");
		
		input = keyboard.nextLine();
		
		choice = input.charAt(0);
		
		
		switch(choice) 
		{
		case 'A' :
			System.out.println("This letter entered is A");
		
			
		case 'B':
			System.out.println("This letter entered is B");
			
		case 'C':
			System.out.println("This letter entered is c");
			
		case 'D':
			System.out.println("This letter entered is D");
			
		default:
			System.out.println("Invalid entry. Please try again");
			
		}
		
	}

}
