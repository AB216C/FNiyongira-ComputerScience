package chapter6DefaultConstructorsAndReturnObjectFromMethods;


/*
 *This program pass an object as an argument 
 *The object is received by the receiving method 
 */

public class PassObject2 {

	public static void main(String[] args) {
		
		
		//Create an inventory object 
		
		InventoryItem item = new InventoryItem("Hammer", 30);
		
		
		//Show the item description 
		
		System.out.println("The content of Item now is as follows:");
		System.out.println("Description:" + item.getDescription());
		System.out.println("Units:" + item.getUnits());
		
		
		// SHow the item description after being changed by the receiving method
		
		
		
		changeItem(item);
		
		
		System.out.println("The content of the item after being changed is as follows:");
		System.out.println("Description:" + item.getDescription());
		System.out.println("Units:" + item.getUnits());
		
		
		
	}
	
	//The following method accept an InventoryItem object 
	//as an argument and change its content

	
	public static void changeItem(InventoryItem i) 
	{
		i.setDescription("Wrench");
	    i.setUnits(320);
	}

}
