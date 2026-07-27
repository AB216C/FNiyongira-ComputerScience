package chapter42RelationalOperators;

import java.util.Scanner;

class PayRoll {
	
	private double hoursWorked;
	private double payRate;
	
	
	public PayRoll() {
		hoursWorked = 0.0;
		payRate = 0.0;
	}
	
	
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public double getGrossPay() {
		
		double grossPay, overTimePay;
		
		if(hoursWorked > 40) {
			grossPay = 40 * payRate;
			
			overTimePay = (hoursWorked-40) * (payRate*1.5);
			
			grossPay += overTimePay;
		}
		else {
			grossPay = hoursWorked * payRate;
		}
		
		return grossPay;
	}
	
}

public class CalculateGrossPay {

	public static void main(String[] args) {
		
		//Create a payroll object 
		
		PayRoll entry = new PayRoll();
		
	
		//Create scanner object for reading input
		
		Scanner  keyboard = new Scanner(System.in);
		
		
		double hours;
		
		double rate;
		
		
		System.out.print("Enter hours Worked: ");
		
		hours = keyboard.nextDouble();

		System.out.print("Enter payRate: ");
		
		rate = keyboard.nextDouble();
		
		
		//Store the data
		
		entry.setHoursWorked(hours);
		entry.setPayRate(rate);
		
		
		// Display the gross pay to the screen
		
		

		System.out.println("Total hours worked for the week is " + entry.getHoursWorked());
		System.out.println("You pay rate is as follows: " + entry.getPayRate());
		System.out.println("Total gross pay for the week is " + entry.getGrossPay());
		
		
		

		
		

		
		
		
		
		
		
		
		
	}

}
