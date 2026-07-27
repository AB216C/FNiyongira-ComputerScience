package chapter4RelationalOperators;

import java.util.Scanner;
/*
 This program demonstrates input statements
 
 * */
public class SwitchDemo {

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
			break;
			
		case 'B':
			System.out.println("This letter entered is B");
			break;
		case 'C':
			System.out.println("This letter entered is c");
			break;
		case 'D':
			System.out.println("This letter entered is D");
			break;
		default:
			System.out.println("Invalid entry. Please try again");
			break;
		}
		
	}

}
