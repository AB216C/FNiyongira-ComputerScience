package chapter9TheInterfaceAndPolymorhism;


/*
 * This program demonstrate that an interface type can be used to create a polymorphic reference
 * */
public class PolymorphicInterfaceDemo {

	public static void main(String[] args) {
		
		
		//Create a CompactDisck object
		
		CompactDisc cd = new CompactDisc("Greatest hits","Joe Looney Band", 18.95 );
		
		//Create a dvd's object
		
		
		DvdMovie dvd = new DvdMovie("Wheels of Fury",137 , 12.95);
		
		
		//Display Cd's title
		
		System.out.println("CD's title: " + cd.getTitle());
		
		
		//Display CD'S PRICE
		
		System.out.println("CD's price: " + cd.getRetailPrice());
		
		
		
		//Display DVD'S TITLE
		
		System.out.println("DVD's title: " + dvd.getTitle() );
		

		//Display DVD'S price
		
		System.out.println("DVD's price: " + dvd.getRetailPrice());
		
		
		System.out.println("\n===================================================\n");
		//SECOND METHOD OF SHOWING PRICE USING print formatting
		
		
		System.out.println("CD's title: " + cd.getTitle());
		showPrice(cd);
		
		
		
		System.out.println("DVD's title: " + dvd.getTitle() );
		showPrice(dvd);
		

	}
	
	//Create a showPrice method 
	//This method will then display the price of RetailItem passed as argument
	
	private static void showPrice(RetailItem item) 
	{
		System.out.printf("Price: %,.2f\n",item.getRetailPrice());
	}
	
	

}
