package chapter9InheritanceCallingSuperClassConstructor;

public class SuperClass2 {
	
	// NO-arg constructor
	
	public SuperClass2 () 
	{
		System.out.println("This is a superclass" + "No arg constructor");
	}
	
	//Constructor 2
	
	
	public SuperClass2(int arg) 
	{
		System.out.println("The following argument was passed to the superclass" 
															+ " constructor " + arg);
	}

}
