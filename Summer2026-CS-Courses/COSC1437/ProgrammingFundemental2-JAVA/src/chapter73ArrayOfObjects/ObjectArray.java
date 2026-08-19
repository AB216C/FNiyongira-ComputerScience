package chapter73ArrayOfObjects;

import java.util.Scanner;

import chapter6DefaultConstructorsAndReturnObjectFromMethods.InventoryItem;


 /**
  * This program works with an array of InventoryItem objects.
  */

public class ObjectArray {

	public static void main(String[] args) {
		
		final int NUM_ITEMS = 3;			//Number of items
		
		
		//create an Inventory array
		
		InventoryItem[] inventory = new InventoryItem[NUM_ITEMS]; 

		
		//Call getItems method to get data for each element.
		
		
		getItems(inventory);
		
		
		System.out.println("You entered the following: ");
		
		//Display the data that user entered
		
		
		for (int index=0; index<inventory.length; index++) 
		{
			System.out.println("Item" + (index+1));
			
			System.out.println("Description: " + inventory[index].getDescription());
			System.out.println("Units :" + inventory[index].getUnits());
			System.out.println("");
		
		}
		
	}
	
	
	   /**
	   * The getItems method accepts an InventoryItem array as
	   * an argument. The user enters data for each element.
	   */
	
	public static void getItems(InventoryItem[] array)
	{
		String description;		//Item description
		int units;				//Number of units on hand
		
		
		//Create a scanner object for keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter data for " + array.length + "inventory items");
		
		
		// Get data for the array
		
		
		for (int index=0; index < array.length; index++) 
		{
			//Get description from users
			System.out.print("Enter description for item#" + (index+1) + ":");
			description = keyboard.nextLine();
			
			//Get units
			System.out.print("Enter number of units for item#" + (index+1) + ":");
			units = keyboard.nextInt();
			
			//Consume the remaining line
			keyboard.nextLine();
			
			//Create inventoryItem object initialized with the data and store the object in the array
			
			array[index] = new InventoryItem(description, units);
			
			//Display blank line
			
			System.out.println(" ");
			

		}
		
		
	}
	
	

}
