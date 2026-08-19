package chapter9TheInterfaceWithDefaultMethod;


/**
  * This class implements the Displayable
  * interface, but does not override the
  * default display method.
  */

public class Person implements Displayable{
	
	private String name;
	
	
	//Constructors
	
	
	public Person(String n) 
	{
		name = n;
	}
	
	

}
