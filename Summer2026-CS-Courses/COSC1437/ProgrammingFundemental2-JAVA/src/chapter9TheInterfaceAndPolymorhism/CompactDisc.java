package chapter9TheInterfaceAndPolymorhism;


/*Compact Disk Class*/

public class CompactDisc implements RetailItem{
	
	private String title;		//The CD'S TITLE
	private String artist;		//Hold the CD's item
	private double retailPrice;		//Hold the CD's price

	/*
	 * Constructor
	 * */
	
	
	public CompactDisc(String cdTitle, String cdArtist, double cdPrice) 
	{
		title = cdTitle;
		artist = cdArtist;
		retailPrice = cdPrice;
	}
	
	// GET title method
	
	
	public String getTitle() 
	{
		return title;
	}
	
	//GET ARTIST METHOD
	
	public String getArtist() 
	{
		return artist;
	}
	
	//GET retail price method(Required by RetailItem interface)
	
	public double getRetailPrice() 
	{
		return retailPrice;
	}
	
}
