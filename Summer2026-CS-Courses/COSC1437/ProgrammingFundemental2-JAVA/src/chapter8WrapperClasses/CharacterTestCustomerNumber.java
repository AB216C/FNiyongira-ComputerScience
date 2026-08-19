package chapter8WrapperClasses;

import java.util.Scanner;

/*
 * This program test a customer number to determine whether it is in the proper format 
 */


public class CharacterTestCustomerNumber {

	public static void main(String[] args) {
		String customer;		//To hold a customer number
		
		//Create a Scanner object for keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the customer in the form LLLNNN");
		System.out.print("Enter the customer in the form LLL = letters NNN=numbers: ");
		
		//Get a customer number form the user
		
		customer = keyboard.nextLine();
		
		//Determine whether it is valid
		
		if (isValid(customer)) 
		{
			System.out.println("That's a valid customer number");
		}
		else
		{
			System.out.println("This is not a proper format. ");
			System.out.println("Here is an example: ABC1234 ");
		}
		
	}
	
	/*
	 * The isValid method accept a String as its argument
	 * and tests its contents for a valid customer number
	 * 
	 * */
	
	
	private static boolean isValid(String custNumber) 
	{
		boolean goodSoFar = true;		//Flag
		int index = 0;			// Loop Control Variable
		
		//is the string the correect length?
		
		if(custNumber.length() != 7)
			goodSoFar = false;
		
		//Test the first three characters for letters
		
		while(goodSoFar && index < 3) 
		{
			if(!Character.isLetter(custNumber.charAt(index)))
				goodSoFar = false;
			index ++;
		}
		
		//Test the last 4 character for digits
		
		while (goodSoFar && index < 7) 
		{
			if(!Character.isDigit(custNumber.charAt(index)))
				goodSoFar = false;
			index ++;
		}
		
		//return results
		
		return goodSoFar;
	}
	

}
