package edu.dallascollege;

/*
 * This class stores the values used by the interpreter. 
 * It contains an accumulator and two memory locations
 * */

public class Environment {
	
	
	//Store the current result being worked on
	private int accumulator;
	
	//First memory location
	private int memoryA;
	
	//Second memory location
	private int memoryB;
	
	
	/*
	 *This is a constructor and will initiate all variables to zero
	 * */
	public Environment() 
	{
		accumulator = 0;
		memoryA = 0;
		memoryB = 0;
		
		
	}
	
	//The function will return the value stored in accumulator
	
	public int getAccumulator() 
	{
		return accumulator;
	}
	
	
	//Set Accumulator function: Store the value in accumulator
	
	public void setAccumulator(int val) 
	{
		accumulator = val;
	}
	
	
	//Get Memory A function: returns the value stored in memory A
	
	public int getMemoryA() 
	{
		return memoryA;
	}
	
	
	//set MemoryA function: Stores the value in Memory A
	
	public void setMemoryA(int val)
	{
		memoryA = val;
	}
	

	//Get Memory A function: returns the value stored in memory B
	
	
	public int getMemoryB()
	{
		return memoryB;
	}
	
	
	//set MemoryB function: Stores the value in Memory B
	
	public void setMemoryB(int val)
	{
		memoryB = val;
	}
	

}
