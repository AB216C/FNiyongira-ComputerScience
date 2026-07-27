package chapter6toStringMethodAndEqualsMethodAndObjectCopyAndClassCollaboration;

/*
 * The Stock class hold data about a stock
 * */

public class Stock {
	
	private String symbol;       //Trading symbol for a stock
	private double sharePrice;	 //current price per share
	
	/*
	 * Constructor: Accept the arguments of the stock's trading symbol and price per share
	 * */
	
	public Stock(String sym, double p) 
	{
		symbol = sym;
		sharePrice = p;
		
	}
	
	//Getters

	public String getSymbol() 
	{
		return symbol;
	}


	public double getSharePrice() 
	{
		return sharePrice;
	}
	
	/*
	 * toString method 
	 */

	
	public String toString() 
	{
		//Create a string describing a stock
		
		
		String str = "Trading Symbol: " + symbol + 
					 "\nShare Price: " + sharePrice;
		
		//Return the string
		
		return str;
		
	}
	
	
	//ADDING EQUALS METHOD FOR COMPARING OBJECTS ON STOCK CLASS
	
	public boolean equals(Stock object2)
	{
		boolean status;
		
		
		//Determine whether this object's symbol and sharePrice fields are equal to object2's symbol and sharePrice fields.
		
		
		if(symbol.equals(object2.symbol) && sharePrice == object2.sharePrice) 
		{
			status = true; 				//Yes the objects are equal
		}
		else
			status = false;				//No the objects are not equal
		
		//return value in status
		
		return status;
		
	}
	
	
	//ADDING COPY FUNCTION ON STOCK CLASS
	
	public Stock copy() 
	{
		//Create a new stock object and initiate it
		//With the same data held by calling the object
		
		Stock copyObject = new Stock(symbol, sharePrice);
		
		
		//return a reference to a new object
		
		
		return copyObject;
		
	}
	
	
	
	
	
}
