package chapter6OverloadConstructors;

public class Rectangle {
	
	private double length;
	private double width;
	
	//Notice first constructor accept no argument.
	//Instead assign 0.0 to length and width
	
	public Rectangle()
	{
		length = 0.0;
		width = 0.0;
	}
	
	
	//Second constructor accept two arguments 
	//that are assigned to width and length field
	
	public Rectangle(double len, double w) 
	{
		length = len;
		width = w;
	}
	
	
	public double getWidth() 
	{
		return width;
	}
	
	
	public double getLength()
	{
		return length;
	}

}
