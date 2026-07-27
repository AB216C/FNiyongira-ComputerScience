package chapter6OverloadedMethodsDiffNumberOfParameters;

import java.util.Scanner;


/*This program is going to ask whether the user want to calculate the weekly pay
 * It can process hourly paid or salaried employed.  
 */

public class WeeklyPayDemo {

	public static void main(String[] args) {
		
		//
		String selection;
		int hours;
		double payRate;
		double yearlySalary;
		
		
		//Create a scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		
		// Ask a user to select between hourly paid or salaried employed
		
		System.out.println("Do you want to calculate your weekly paid as hourly paid or as as a salary? ");
		System.out.println("Enter H for hourly paid or S for salary pay? ");

		
		selection = keyboard.nextLine();
		
		
		switch(selection.charAt(0)) 
		{
		
		case 'H':
		case 'h':
		{
			System.out.println("How many hours you worked per week?");
			hours = keyboard.nextInt();
			
			System.out.println("Enter pay rate:");
			payRate = keyboard.nextDouble();
			
			System.out.println("Your weekly pay is " + Pay.weeklyPay(hours,payRate));
			break;
			
			
		}
		
		case 'S':
		case 's':
		{
			System.out.println("Enter your yearly salary");
			yearlySalary = keyboard.nextDouble();
			
			System.out.println("Your weekly pay is " + Pay.weeklyPay(yearlySalary));
			break;
			
		}
		
		default:
			System.out.println("Invalid selection");
		
		}

		
	}

}
