package chapter8WrapperClasses;


import java.util.Scanner;


/**
  * This program demonstrates the Telephone
  * class's static methods.
  */

public class TelephoneFormatAndUnformatTester {

	public static void main(String[] args) {
		
		String phoneNumber;		//To hold a phone number
		
		//Create a scanner object for a keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		 // Get an unformatted telephone number.
		
	    System.out.print("Enter an unformatted telephone number: ");
	    phoneNumber = keyboard.nextLine();
	    
	    System.out.println("Formatted: " + Telephone.format(phoneNumber));
	    
	    
	     // Format the telephone number.
	    
	    System.out.println("Enter Formatted phone number:");
	    System.out.print("(XXX)XXX–XXXX : ");
	    
	    phoneNumber = keyboard.nextLine();
	    
	    
	 // Unformat the telephone number.
	    
	    System.out.println("Unformatted:" + Telephone.unformat(phoneNumber));
	    
	    
	    
	}

}
