package chapter42RelationalOperators;

import java.util.Scanner;


// using .equals() to compare strings


public class CompareStrings {

	public static void main(String[] args) {
		//CREATE scanner object
		

		
		Scanner keyboard = new Scanner(System.in);
		
		
		String name1,
			   name2,
			   name3;
		
		//Ask user to enter the first name
		
		System.out.println("Enter the first name:");
		
		name1 = keyboard.nextLine();
		
		
		System.out.println("Enter a second name:");
		
		name2 = keyboard.nextLine();
		
		
		if (name1.equals(name2)) 
		{
			System.out.println("The first name " + name1 + " and the second name " + name2 +" are the same" );
		}
		else
		{
			System.out.println("The first name and second name are not the same\n");
		}
		
		
		System.out.println("Enter a third name name:");
		
		name3 = keyboard.nextLine();
		
		
		if(name2.equals(name3))
			
		{ 
			System.out.println("The second name " + name2 + " and the third name " + name3 +" are the same" );
		}
		else
			
		{
			System.out.println("The second name and third name are not the same\n");
		}
		
		if(!name3.equals("Mathew")) 
		{
			System.out.println("Mathew is unlucky nowadays");
		}
		else 
		{
			System.out.println("Congratulations Mathew");
		}
			
	}

}
