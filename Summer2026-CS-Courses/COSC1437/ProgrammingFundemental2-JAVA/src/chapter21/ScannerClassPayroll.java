package chapter21;

import java.util.Scanner;           //Needed for the scanner class

/*
 This program demonstrate scanner class
  
 */

public class ScannerClassPayroll {

	public static void main(String[] args) {
		
		String name;
		int hours;
		double payRate;
		double grossPay;
		
		
		//CREATE Scanner object to read input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		// Get the user's name
		
		System.out.println("Enter your name: ");
		name = keyboard.nextLine();
		
		
		// Get the number of hours worked this week
		
		System.out.println("How many hours worked this week? ");
		
		hours = keyboard.nextInt();
		
//		keyboard.nextLine();
		
		// Get user's hourly pay rate
		
		System.out.println("How much you get paid per hour? ");
		payRate = keyboard.nextDouble();
		keyboard.nextLine();   //This line is very essential because the next input will be text or sentence; if not used, compiler error will occur
		                       //nextInt(),nextDouble(), nextFloat() all behave the same, they are read only numbers and leave [ \n  ] behind and unread
		                        // Example; if you enter 25, the result is 25\n ; 25\n is in the input buffer 
		                        // When next input is characters, it makes it worse, because character can't consume left over
		                         // By using sc.nextLine() or keyboard.nextLine(); this left over \n is then consumed
		        			      // Then next character or sentences can be read
		
		
		//Calculate the gross pay
		
        grossPay = payRate * hours;
        
        // Display the resulting information
        
        System.out.println("Your name is " + name);
        System.out.println("Your gross pay is " + grossPay);
		
		
		//READING CHARACTERS
        
        String input;
        char answer;
        
        
        System.out.println("Are you having fun? Yes or No?");
        
        input = keyboard.nextLine();
        
        answer = input.charAt(0);
        
        
        System.out.println("Here is my first response" + input );
        System.out.println("My first Character of my response is " + answer );
       

	}

}
