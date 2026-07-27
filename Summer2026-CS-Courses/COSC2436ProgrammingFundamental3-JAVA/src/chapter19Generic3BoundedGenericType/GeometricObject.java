package chapter19Generic3BoundedGenericType;

public abstract class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	
	/*Construct a default Geometric object*/
	
	protected GeometricObject() 
	{
		dateCreated = new java.util.Date();
	}
	
	
	/**Construct a Geomoetric object with color and filled vallue*/
	
	protected GeometricObject(String color, boolean filled) 
	{
		this.color = color;
		this.filled = filled;
	}
	
	
	
	/*Return color**/
	
	public String getColor() 
	{
		return color;
	}
	
	
	/**Set a new color*/
	
	public  void setColor(String color) 
	{
		this.color = color;
	}
	
	
	/**Return filled. Since filled is boolean, the getMethod is named isFilled*/
	
	public boolean isFilled() 
	{
		return filled;
	}
	
	
	/**set a new filled*/
	
	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}
	
	
	/**get date crated*/
	
	public java.util.Date getDateCreated() 
	{
		return dateCreated;
	}
	
	/**Return a string representation of of this object*/
	
	@Override
	public String toString() 
	{
		return "Created on" + dateCreated + "\nColor:" + color + "and filled: " + filled;
	}
	
	
	
	/**Abstract method getArea*/
	
	public abstract double getArea();
	
	
	/**Abstract method getPerimeter*/
	
	public abstract double getPerimeter();

}
