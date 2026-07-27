package chapter6TheInnerClass;

/*
 * This program demonstrate the RetailItem class
 * which has an inner class
 * */
public class RetailItemInnerClassDemo {

	public static void main(String[] args) {
		
		//Create a retailItem object
		
		RetailItem item = new RetailItem("Candy bar", 17789, 0.75, 0.15);
		
		
		//Display the item's information
		
		System.out.println(item);
	}

}
