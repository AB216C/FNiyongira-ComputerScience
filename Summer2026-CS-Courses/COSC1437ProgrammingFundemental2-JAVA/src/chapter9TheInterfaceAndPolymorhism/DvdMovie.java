package chapter9TheInterfaceAndPolymorhism;

/*DVD MOVIE CLASS*/

public class DvdMovie implements RetailItem{

	private String title;		//The DVD'S title
	private int runningTime;	//Running time minutes
	private double retailPrice;		//DVD'S retail price
	
	
	
	/*CONSTRUCTOR*/
	
	public DvdMovie(String dvdTitle, int runTime, double dvdPrice) 
	{
		title = dvdTitle;
		runningTime = runTime;
		retailPrice = dvdPrice;
	}
	
	
	
	/*
	 * getTitle method
	 * 
	 * */
	
	
	public String getTitle() 
	{
		return title;
	}
	
	
	
	/*
	 * Get runningTime method
	 * */
	
	
	public int getRunningTime() 
	{
		return runningTime;
	}
	
	
	
	/*
	 * Get retailPrice method(Required by RetailItem interface)
	 * */
	
	public double getRetailPrice() 
	{
		return retailPrice;
	}
	
}
