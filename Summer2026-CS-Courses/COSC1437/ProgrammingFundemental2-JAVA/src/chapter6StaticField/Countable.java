package chapter6StaticField;

public class Countable {
	
	static private int instanceCount = 0;
	
	
	/*
	 * The constructor increment the static field of the instanceCount
	 * This keeps track of the number of instances of this class that will be created
	 * */
	
	public Countable() 
	{
		instanceCount++;
	}
	
	
	public int getInstanceCount() 
	{
		return instanceCount;
	}
	
	

}
