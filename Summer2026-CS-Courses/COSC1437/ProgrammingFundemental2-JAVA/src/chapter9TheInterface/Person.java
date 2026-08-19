package chapter9TheInterface;

public class Person implements Displayable{
	
	private String name;
	
	
	//Constructor 
	
	public Person(String n) 
	{
		name = n;
	}
	
	
	
	public void display() 
	{
		System.out.println("My name is " + name);
	}


}
