package chapter6TheEnumeratedOwnFiles;

public class SportsCar {
	
	private  CarType make;		//car's make
	private CarColor color;		//car's color
	private double price;		//car's price
	
	
	
	
	/*Constructor accept the arguments of the car's make, color and price*/
	
	
	public SportsCar(CarType aMake, CarColor aColor, double aPrice) 
	{
		make = aMake;
		color = aColor;
		price = aPrice;
	}
	
	
	//Getters
	
	
	public CarType getMake() 
	{
		return make;
	}
	
	
	
	public CarColor getColor() 
	{
		return color;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	
	//toString method
	
	
	public String toString() 
	{
		String str = String.format("Make: %s\n" + 
									"Color: %s\n" + 
									"Price: %,.2f \n",
									make, color, price);
		
		return str;
	}
	
	

}
