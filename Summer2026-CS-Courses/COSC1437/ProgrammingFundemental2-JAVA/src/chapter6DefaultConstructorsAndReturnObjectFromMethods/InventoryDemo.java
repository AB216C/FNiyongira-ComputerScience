package chapter6DefaultConstructorsAndReturnObjectFromMethods;

/*
 * This program demonstrates the inventory class's three constructors 
 */

public class InventoryDemo {

	public static void main(String[] args) {
		
		//Create variables to reference 3 instances of InventoryItem
		
		
		InventoryItem item1, item2, item3;
		
		//Instantiate item1 and use no arg constructor
		
		item1 = new InventoryItem();
		
		
		System.out.println("Item1:");
		System.out.println("Description:" + item1.getDescription());
		System.out.println("Units:" + item1.getUnits());
		
		
		//Instantiate item2 and use the second constructor
		
		item2 = new InventoryItem("Wrench");
		
		System.out.println("Item2:");
		System.out.println("Description:" + item2.getDescription());
		System.out.println("Units:" + item2.getUnits());
		
		
		//Instantiate item3 and use 3rd constructor
		
		
		item3 = new InventoryItem("Hammer", 25);
		
		System.out.println("Item3:");
		System.out.println("Description:" + item3.getDescription());
		System.out.println("Units:" + item3.getUnits());
	

	}

}
