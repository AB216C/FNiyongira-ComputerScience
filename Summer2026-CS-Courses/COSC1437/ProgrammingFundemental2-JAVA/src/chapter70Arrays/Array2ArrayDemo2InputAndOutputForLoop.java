package chapter70Arrays;

import java.util.Scanner;

public class Array2ArrayDemo2InputAndOutputForLoop {

	public static void main(String[] args) {
		

		
		final int NUM_EMPLOYEES = 3;     //Number of employees
		
		// Create an array to hold employee hours
		
		int [] hours = new int[NUM_EMPLOYEES];
		
		//Create a Scanner object for a keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the hours worked by " +
			              NUM_EMPLOYEES + " employees.");
		
		
		
		// Cycle through array, and get hours each employee worked
		
		for (int index = 0; index < NUM_EMPLOYEES; index++) 
		{
			System.out.println("Employee" + (index+1) + ":");
			hours[index] = keyboard.nextInt();
			
		}
		
		
		//Cycle through the array displaying each element
		System.out.println("The hours you entered are:");
		
		for (int index = 0; index < NUM_EMPLOYEES; index++) 
		{
			System.out.println(hours[index]);
		}
	}

}
