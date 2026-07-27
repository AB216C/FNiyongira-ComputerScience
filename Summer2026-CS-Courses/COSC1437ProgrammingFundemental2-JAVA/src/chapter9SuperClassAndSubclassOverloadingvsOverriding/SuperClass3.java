package chapter9SuperClassAndSubclassOverloadingvsOverriding;


/*
 * The following class display an int
 * */
public class SuperClass3 {
	
	
	public void showValue(int arg) 
	{
		System.out.println("SUPERCLASS: the int argument was " + arg);
	}
	
	
	
	
	/*
	 * The following class display an int
	 * */
	
	public void showValue(String arg) 
	{
		System.out.println("SUPERCLASS: the String argument was " + arg);
	}
	
	


}
