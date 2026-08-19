package chapter70Arrays;

import java.util.Scanner;
public class Array2ArrayDemo1InputAndOutputElements {

	public static void main(String[] args) {
		

		
		/*
		 * This program shows values being read into an array's elements and then displayed
		
		*/
		
		
		final int NUM_EMPLOYEES = 3;     //Number of employees
		
		// Create an array to hold employee hours
		
		int [] hours = new int[NUM_EMPLOYEES];
		
		//Create a Scanner object for a keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the hours worked by " +
			              NUM_EMPLOYEES + " employees.");
		
		//Get Employee's first hours
		
		System.out.println("Employee 1: ");
		
		hours[0] = keyboard.nextInt();
		
		System.out.println("Employee 2: ");
	
		hours[1] = keyboard.nextInt();
		
		System.out.println("Employee 3: ");
		
		hours[2] = keyboard.nextInt();
		
		
		
		//Display the value in the array
		
		System.out.println("The hours you entered are:");
		System.out.println(hours[0]);
		System.out.println(hours[1]);
		System.out.println(hours[2]);
		
	
		
	}

}
