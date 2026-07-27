package chapter8WrapperClasses;

/*This program use startsWith methods to search using a partial string*/

import java.util.Scanner;

public class StringObjectsPersonSearch {

	public static void main(String[] args) {
		
		
		String lookUp;	//To hold a look up string
		
		
		//Create arrays of names
		
		
		String[] people =  { "Cutshaw, Will", "Davis, George",
				              "Davis, Jenny", "Russert, Phil",
				              "Russell, Cindy", "Setzer, Charles",
				               "Smart, Kathryn", "Smith, Chris",
				               "Smith, Brad", "Williams, Jean" };
		
		//Create Scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Get a pertial name from a user to search for 
		
		System.out.println("Enter the first few character of the name to look up");
		
		lookUp = keyboard.nextLine();
		
		
		//Display all names that begins with a name entered by the user
		
		
		System.out.println("Here are the names that matches: ");
		for (String person:people) 
		{
			if (person.startsWith(lookUp))
				System.out.println(person);

		}
		
		
		
	}

}
