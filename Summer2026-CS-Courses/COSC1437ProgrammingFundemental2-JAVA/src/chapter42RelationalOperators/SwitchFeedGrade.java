package chapter42RelationalOperators;

import java.util.Scanner;

public class SwitchFeedGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input;
		char feedGrade;
		
		
		//Create scanner objects to collect inputs
		
		Scanner keyboard = new Scanner(System.in);
		
		
	   // Ask users to choose grade of the pet feed
		
		System.out.print("We have three  Grades for our pet feed? \n");
		System.out.print("A, B, and C. Which one do you want the price for? ");
		
		input = keyboard.nextLine();
		
		feedGrade = input.charAt(0);
		
		switch(feedGrade) 
		{
		case 'A':
		case 'a':
		{
			System.out.println("$3 per lb");
			break;
		}
		case 'B':
		case 'b':
		{
			System.out.println("$1.5 per lb");
			break;
		}
		
		case 'C':                 //Since case "C" has no statement, the program will fall through the next case which correspond with 'c'
		case 'c':
		{
			System.out.println("$1 per lb");
			break;
		}
		
		default:
			System.out.print("Invalid input. Please try again");
		
		}


	}

}
