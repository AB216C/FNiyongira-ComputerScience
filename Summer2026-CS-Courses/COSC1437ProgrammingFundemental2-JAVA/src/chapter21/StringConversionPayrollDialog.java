package chapter21;

import javax.swing.JOptionPane;

/**
 * This program demonstrates using dialog with j option panes
 * 
 * */
public class StringConversionPayrollDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString;
		String name;
		int hours;
		double payRate;
		double grossPay;
		
		//Get the user's name
		
		
		name = JOptionPane.showInputDialog("What is your name? ");
		
		// Get hours worked
		
		
		inputString = JOptionPane.showInputDialog("How many hours worked?");
		
		
		// convert hours worked to an integer
		
		hours = Integer.parseInt(inputString);
		
		
		// Get hourly rate
		
		inputString = JOptionPane.showInputDialog("What is your hourly pay");
		
		// convert payrate to double
		
		payRate = Double.parseDouble(inputString);
		
			
		
		// Calculate gross PAY
		
		grossPay = payRate * hours;
		
		
		JOptionPane.showMessageDialog(null, "Hello" + name + " your gross pay is " + grossPay);
		
		
		System.exit(0);       //This means, exit in zero seconds; you can increase time from zero and plus more
		
		
	}

}
