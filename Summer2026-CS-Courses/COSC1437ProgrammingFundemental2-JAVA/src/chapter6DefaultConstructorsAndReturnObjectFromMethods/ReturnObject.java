package chapter6DefaultConstructorsAndReturnObjectFromMethods;
import java.util.Scanner;

/*
 * This program demonstrate how a method can return a reference to an object 
 */

public class ReturnObject {

	public static void main(String[] args) {
		//Declare a vairiable that will be used
		//To refernece an InventoryItem OBJECT
		
		
		InventoryItem item;
		
		//The getData method will return a reference to an InventoryItem object
		
		item = getData();
		
		
		//Display the object's data 
		
		System.out.println("Here is the data you entered");
		
		
		System.out.println("Description: " + item.getDescription() + 
				
				            ", Units: " + item.getUnits());
		
	
	}
	
	/*
	 *The getData method get the item's description and the number of units from the user.
	 *The method returns an InventoryItem object containing the data that was entered
	 *
	 */
	
	
	
	public static  InventoryItem getData() 
	{
		String desc;
		int units;
		
		
		//Create a scanner object for a keyboard input
		
		
		Scanner keyboard = new Scanner(System.in);
		
		//Get the item description
		
		System.out.print("Enter item description:");
		
		desc = keyboard.nextLine();
		
		
		System.out.print("Enter total number of units:");
		
		units = keyboard.nextInt();
		
		
		//Create an inventory object and return a reference to it
		
		
		return new InventoryItem(desc, units);
		
		
	}

}
