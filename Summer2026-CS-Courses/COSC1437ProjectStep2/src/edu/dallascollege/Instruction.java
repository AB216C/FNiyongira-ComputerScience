package edu.dallascollege;

/*
 * Abstract parent class for all ToyLand instructions 
 */

public abstract class Instruction 
{
	
	//Type of instruction
	
	protected OpCode code;
	
	//Constructor
	
	public Instruction(OpCode instructionCode) 
	{
		code = instructionCode;
	}
	
	//Return Instruction type
	
	public OpCode getCode() 
	{
		return code;
	}
	
	/*
	 * Every class that extends Instruction must 
	 * provide its implementation of the execute() method
	 * 
	 */
	
	public abstract void execute(Environment env);
	

}
