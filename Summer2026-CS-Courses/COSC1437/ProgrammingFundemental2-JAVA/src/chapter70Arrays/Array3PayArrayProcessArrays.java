
package chapter70Arrays;

import java.util.Scanner;
/**
  * This program stores in an array the hours worked by
  * five employees who all make the same hourly wage.
  */
  
public class Array3PayArrayProcessArrays {

	public static void main(String[] args) {
		
		final int NUM_EMPLOYEES = 5;
		
		double payRate,
			   grossPay;
		
		
		//Create an array for employee hours
		
		
		int [] hours = new int[NUM_EMPLOYEES];
		
		
		//Create a scanner for  keyboard inputs
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		System.out.println("Enter hours worked by " + NUM_EMPLOYEES + " who all get paid the same hourly pay\n");
		
		
		//Get each employee total hours worked
		
		
		for (int index = 0; index < NUM_EMPLOYEES; index ++) 
		{
			System.out.println("Enter hours worked for employee " + (index+1) + ":" );
			hours[index] = keyboard.nextInt();
;		}
		
		
		//Get employees hourly pay
		
		System.out.println("Enter payRate: ");
		payRate = keyboard.nextDouble();
		
		
		//Display each employee's gross pay
		
		
		for (int index = 0; index < NUM_EMPLOYEES; index ++) 
		{
			grossPay = payRate * hours[index];
			System.out.printf("The gross pay for the employee" + (index+1) + " is %,.2f \n", grossPay);
;		}
		
		
	}

}
