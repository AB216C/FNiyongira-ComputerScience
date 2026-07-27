package chapter9InheritanceCallingSuperClassConstructor;

public class SubClass2 extends SuperClass2 {
	
	// Constructor
	
	public SubClass2() 
	{
		//CALL SUPERCLASS constructor
		
		super(10);
		
		
		//Display a message
		
		System.out.println("This is a subclass" + "Constructor");
	}
	


}
