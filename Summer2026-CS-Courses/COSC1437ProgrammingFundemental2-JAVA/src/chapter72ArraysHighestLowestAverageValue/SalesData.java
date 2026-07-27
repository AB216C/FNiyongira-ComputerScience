package chapter72ArraysHighestLowestAverageValue;

 /**
  * This class keeps the sales figures for a number of
  * days in an array and provides methods for getting
  * the total and average sales, and the highest and
  * lowest amounts of sales.
  */

public class SalesData {
	
	private double[] sales;
	
	
	  /**
	   * The constructor accepts an array as an argument.
	   * The elements in the argument array are copied
	   * to the sales array
	   */
	
	public SalesData(double[] s) 
	{
		//Create a new array-same length as s.
		
		sales = new double[s.length];
		
		
		//Copy that values in s to sales
		
		for (int index=0; index<s.length; index++) 
		{
			sales[index] = s[index];
		}
	}
	
	   /**
	   * The getTotal method returns the total of the
	   * elements in the sales array.
	   */
	
	public double getTotal() 
	{
		double total = 0.0;		//Accumulator
		
		for (double sale:sales) 
		{
			total += sale;
		}
		
		return total;
	}
	
	   /**
	   * The getAverage method returns the average of the
	   * elements in the sales array.
	   */
	
	public double getAverage() 
	{
		double average;
		
		average = getTotal()/sales.length;
		
		
		return average;
	}
	
	   /**
	   * The getHighest method returns the highest value
	   * stored in the sales array.
	   */
	
	public double getHighest() 
	{
		double highest = sales[0];
		
		for (int index = 0; index< sales.length; index++) 
		{
			if (sales[index]> highest) 
			{
				highest = sales[index];
			}
		}
		
		return highest;
	}
	
	   /**
	   * The getLowest method returns the lowest value
	   * stored in the sales array.
	   */
	
	public double getLowest() 
	{
		double lowest = sales[0];
		
		for (int index = 0; index< sales.length; index++) 
		{
			if (sales[index]< lowest) 
			{
				lowest = sales[index];
			}
		}
		
		return lowest;
	}
	
	
	
	
	
	

}
