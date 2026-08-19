package chapter19Generic3BoundedGenericType;

public class Circle extends GeometricObject{
	
	private double radius;
	
	
	public Circle() 
	{
		
	}
	
	public Circle(double radius) 
	{
		this.radius = radius;
	}
	
	
	//return redius
	
	public double getRadius() 
	{
		return radius;
	}
	
	/**Set a new radius*/
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
				/**Return area*/
	@Override						
	public double getArea() 
	{
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter() 
	{
		return Math.PI * 2 * radius;
	}
	

	//Get Diameter-----This is not an abstract method; overriding not needed
	
	public double getDiameter() 
	{
		return radius * 2;
	}

}
