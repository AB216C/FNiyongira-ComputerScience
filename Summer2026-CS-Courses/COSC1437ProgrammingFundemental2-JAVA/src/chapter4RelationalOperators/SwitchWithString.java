package chapter4RelationalOperators;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		
		String input;

		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter a name of the season");
		
		
		input = keyboard.nextLine();
		
		
		//Translate seasons from english to spanish 
		
		
		switch(input) 
		{
		case "Winter":
			System.out.println("Invierno");
			break;
			
		case "Spring":
			System.out.println("Primavera");
			break;
			
		case "Summer":
			System.out.println("verano");
			break;
			
		case "Fall":
		case "Autumn":
			System.out.println("Otono");
			break;
			
		default:
			System.out.println("Invalid entry");
			System.out.println("Please enter winter, spring, summer or fall/autumn");
			
		
		}	
		
	}

}
