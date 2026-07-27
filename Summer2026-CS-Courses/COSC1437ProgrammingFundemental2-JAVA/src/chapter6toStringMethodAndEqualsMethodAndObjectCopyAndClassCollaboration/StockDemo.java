package chapter6toStringMethodAndEqualsMethodAndObjectCopyAndClassCollaboration;

/*
 * This methods demonstrates the Stock clas's toString method
 * */

public class StockDemo {

	public static void main(String[] args) {
		
		
		//Create a stock for XZY Company
		//The trading symbol is XZY and current price per share is $9.45;
		
		
		Stock XZYCompany = new Stock("XZY", 9.45);
		
		
		//Display the value
		
		
		System.out.println(XZYCompany);
		
		
	}

}
