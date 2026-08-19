package chapter9SuperClassAndSubclassOverloadingvsOverriding;

public class SubClass3 extends SuperClass3 {
	
	
	/*
	 * These methods overrides one of the superclass methods
	 * */
	
	
	@Override
	
	public void showValue(int arg) 
	{
		System.out.println("SUBCLASS: the int argument was " + arg);
	}
	
	
	
	
	/*
	 * This method overloads the superclass methods
	 * */
	
	
	public void showValue(double arg) 
	{
		System.out.println("SUBCLASS: the double argument was " + arg);
	}
	

}
