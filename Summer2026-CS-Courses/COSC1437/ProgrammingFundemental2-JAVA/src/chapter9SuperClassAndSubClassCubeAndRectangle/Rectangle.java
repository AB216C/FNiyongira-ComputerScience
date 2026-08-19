package chapter9SuperClassAndSubClassCubeAndRectangle;

public class Rectangle {
	
	private double length;
	private double width;
	
	
	public Rectangle(double len, double w) 
	{
		length = len;
		width = w;
	}
	
	
	//Set length
	
	public void setLength(double len) 
	{
		length = len;
	}
	
	//set width

	
	public void setWidth (double w) 
	{
		width = w;
	}
	
	//get length
	
	public double getLength() 
	{
		return length;
	}
	
	
	//Get width
	
	public double getWidth() 
	{
		return width;
	}
	
	//get area
	
	public double getArea() 
	{
		return length * width;
	}
	

}
