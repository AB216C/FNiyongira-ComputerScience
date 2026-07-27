package chapter7ArrayList;

public class InventoryItem {
	
	private int units;                //units on hand
	private String description;       //Description
	
	//No argument constructor
	public InventoryItem() 
	{
		units = 0;
		description = "";
	}
	
	/*
	 *The following constructor accepts a string argument 
	 *that is assigned to the description field 
	 */
	
	public InventoryItem( String d) 
	{
		description = d;
		units = 0;
	}
	
	/*
	 *The following constructor accept the string argument 
	 *that is assigned to the description field and 
	 *an int argument that is assigned to the units field 
	 */
	
	
	public InventoryItem(String d, int u) 
	{
		description = d;
		units = u;
	}
	
	
	public int getUnits() 
	{
		return units;
	}
	
	
	public String getDescription() 
	{
		return description;
	}
	
	
	public void setUnits(int u) 
	{
		units = u;
	}
	
	public void setDescription(String d) 
	{
		description = d;
	}


}
