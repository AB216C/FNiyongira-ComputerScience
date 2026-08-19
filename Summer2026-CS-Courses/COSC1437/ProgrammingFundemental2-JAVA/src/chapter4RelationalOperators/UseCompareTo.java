package chapter4RelationalOperators;

import java.util.Scanner;

public class UseCompareTo {

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
		
		
		if (name1.compareTo(name2)<0) 
		{
			System.out.println("The first name " + name1 + " and the second name " + name2 +" are less than zero" );
		}
		else
		{
			System.out.println("The first name and second name are greater than zero\n");
		}
		
		
		System.out.println("Enter a third name name:");
		
		name3 = keyboard.nextLine();
		
		
		if(name2.compareTo(name3)>= 90)
			
		{ 
			System.out.println("The second name " + name2 + " and the third name " + name3 +" are greater than or equal to 90" );
		}
		else
			
		{
			System.out.println("The second name and third name are less than 90\n");
		}
		
			
	
	}

}
