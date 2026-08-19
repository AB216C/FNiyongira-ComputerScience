package chapter6toStringMethodAndEqualsMethodAndObjectCopyAndClassCollaboration;


/*
 * This program represent the a stock purchase
 * */
public class StockPurchase {
	
	private Stock stock;			//Stock that was purchased
	private int shares;				//Number of shares owned
	
	
	/*
	 * The constructor accepts arguments for the stock and  the number of shares
	 * */
	
	
	public StockPurchase(Stock stockObject, int numShares) 
	{
		// CREATE A COPY OF THE object referenced by stockObject
		
		stock = stockObject.copy();
		shares = numShares;
	}
	
	
	
	//getStock method
	
	
	public Stock getStock() 
	{
		//return a copy of the object referenced by stock
		
		
		return stock.copy();
	}
	
	
	
	//getShares method
	
	public int getShares()
	{
		return shares;
	}
	
	
	/*
	 * getCost method return the cost of the stock purchase
	 * */
	
	
    public double getCost() 
    {
    	return shares * stock.getSharePrice();
    }
	

}
