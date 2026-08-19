package chapter8WrapperClasses;

import java.util.Scanner;

/*This program demonstrates Character class to UpperCase method*/

public class CircleArea {

	public static void main(String[] args) {
		
		double radius;	//The circle's radius
		double area;	//The circle's area
		String input;	//To hold a line of input
		char choice;	//To hold a single character
		
		
		
		//Create a scanner object to read a keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		do 
		{
			//Get the circle's radius
			
			System.out.println("Enter the circle's radius");
			
			radius = keyboard.nextDouble();
			
			
			//Consume the new line remaining character 
			
			
			keyboard.nextLine();
			
			
			// Calculate and display the area
			
			area = Math.PI * radius * radius;
			
			System.out.printf("The area is %.2f \n",area);
			
			
			//Repeat this
			
			System.out.println("Do you want to do this again? (Y or N)");
			
			input = keyboard.nextLine();
			choice = input.charAt(0);
			
			
			
			
		}while (Character.toUpperCase(choice) == 'Y');
		
	
		
	}

}
