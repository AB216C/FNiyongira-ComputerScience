package chapter6toStringMethodAndEqualsMethodAndObjectCopyAndClassCollaboration;


/*The following program allow you to purchase shares of the XYZ company's stock */

import java.util.Scanner;

public class StockTraderDemo {

	public static void main(String[] args) {
		
		
		int sharesToBuy;
		
		
		
		//Create a stock object for the company
		//The trading symbol is currently XYZ
		//The stock is currently $9.62 per share
		
		
		
		Stock xyzCompany = new Stock("XYZ", 9.62);
		
		
		
		//CREATE A SCANNER OBJECT FOR A KEYBOARD INPUT
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Display the current share price
		
		System.out.printf("ZYX COMPANY's stock is currently %,.2f " + "per share.\n", xyzCompany.getSharePrice());
		
		// Get the number of shares to purchase.
		
		System.out.println("How many shares do you want to buy? ");
		sharesToBuy = keyboard.nextInt();
		
		// Create a StockPurchase object for the transaction.
		
		StockPurchase buy = new StockPurchase(xyzCompany, sharesToBuy);
		
		
		//Display cost of the transaction
		
		System.out.printf("Cost of the stock: %,.2f \n",buy.getCost());
		
		
	}

}
