package chapter70Arrays;

import java.util.Scanner;

/**
  * This program stores in an array the hours worked by 
  * five employees who all make the same hourly wage.  
  * Overtime wages are paid for hours greater than 40.
  */

public class Array3CalculateOvertimeGrossPay {

	public static void main(String[] args) {
		
		final int NUM_EMPLOYEES = 5;		//Number of employees
		
		double payRate, 		//Hourly pay Rate
			   grossPay, 		//Gross pay
			   overtime;		//Overtime wage
		
		
		
		
		//Create an array for an employee hours
		
		int [] hours = new int[NUM_EMPLOYEES];
		
		//Create a scanner object for a keyboard input
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Entering hours worked by each employee
		
		System.out.println("Enter the total number of hours worked by " + NUM_EMPLOYEES +
							"employees who earn the same hourly pay");
		
		
		
		for (int index= 0; index < NUM_EMPLOYEES; index++) 
		{
			System.out.print("Enter total number of hours worked by employee " + (index + 1) +" : ");
			hours[index] = keyboard.nextInt();
		}
		
		
		//Get the hourly payRate
		
		System.out.print("Enter the hourly pay rate:");
		
		payRate = keyboard.nextDouble();
		
		
		//Display each employees Gross pay
		
		for (int index = 0; index < NUM_EMPLOYEES; index++) 
		{
			//calculate base pay
			
			if(hours[index]>40) 
			{
				grossPay = payRate * 40;
				
				//Calculate overtime pay
				
				overtime = (hours[index]-40)*(1.5*payRate);
				
				
				//Add basepay to overtime
				
				grossPay += overtime;
			}
			else 
			{
				grossPay = hours[index] * payRate;
			}
			
			System.out.printf("Employee %d grossPay is $%,.2f \n",(index+ 1), grossPay);
			
		}

	}

}
