package chapter6TheInnerClass;

public class RetailItem {
	
	private String description;      //Item descriptoin
	private int itemNumber;			//Item number
	private CostData cost;			  //Cost data
	
	
	
	/*Retail item class constructor*/
	
	public RetailItem(String desc, int itemNum, double wholesale, double retail) 
	{
		description = desc;
		itemNumber = itemNum;
		cost = new CostData(wholesale, retail);
		
	}
	
	
	/*
	 * Retail item class toString method
	 * */
	
	
	public String toString() 
	{
		
		String str;      //To hold a descriptive string
		
		//Create a formatted string describing the item number
		
		str = String.format("Description: %s\n" +
							"Item number: %d \n" + 
							"wholesale cost:%,.2f \n"+
							"Retail price: %,.2f\n", description, 
													  itemNumber, 
													  cost.wholesale, 
													  cost.retail);
		
		return str;
	}
	
	/*Costdata Inner class*/
	
	
	private class CostData 
	{
		public double wholesale, 	//whole sale cost
						retail;		//Retail price
	
		
		
		/*CostData class constructor*/
		
		
		public CostData(double w, double r) 
		{
			wholesale = w;
			retail = r;
		}
	}
	
	

}
