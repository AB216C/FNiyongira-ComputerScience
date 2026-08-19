package chapter19Generic3BoundedGenericType;

public class Rectangle extends GeometricObject {
	
	private double width;
	private double height;
	
	public Rectangle() 
	{
		
	}
	
	public Rectangle(double width, double height) 
	{
		this.height = height;
		this.width = width;
	}
	
	//Return width
	
	public double getWidth() 
	{
		return width;
	}
	
	//SET A NEW WIDTH
	
	public void setWidth(double width) 
	{
		this.width = width;
	}
	
	
	//Return height
	
	public double getHeight() 
	{
		return height;
	}
	
	//Set a new height
	
	public void setHeight(double height) 
	{
		this.height = height;
	}
	
	
	//return area
	
	@Override
	public double getArea() 
	{
		return width * height;
	}
	
	
	
	//return parameter
	@Override
	public double getPerimeter() 
	{
		return (width+height)*2;
	}

}
