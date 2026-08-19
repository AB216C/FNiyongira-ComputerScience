package chapter5Notes;

import java.util.Scanner;

public class ValidateInputRepeadly {

	public static void main(String[] args) {
		
		int num;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		// Prompt a user to input a number between 1 and 100
		
		
		System.out.println("Enter a number between 1 and 100");
		num = keyboard.nextInt();
		
		
		while (num < 1 || num > 100) {
			
			System.out.println("Invalid number");
			System.out.println("Enter the number again: ");
			num = keyboard.nextInt();
		}
		
		System.out.println("That's correct");
		System.out.println("The Entered number was " + num);

	}

}
