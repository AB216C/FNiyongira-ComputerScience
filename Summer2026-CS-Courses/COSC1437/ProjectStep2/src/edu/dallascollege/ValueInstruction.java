package edu.dallascollege;

/*
 * This class loads a number into one register
 * */

public class ValueInstruction extends Instruction{
	
	// A number to store
	
	private int value;
	
	
	//Destination register
	
	private int destReg;
	
	/*
	 *  Constructor
	 */
	
	public ValueInstruction(int val, int destinationReg) 
	{
		//LOAD_VAL is the only opcode for this instruction
		
		super(OpCode.LOAD_VAL);
		
		value = val;
		
		//Make sure register number is valid
		
		if(destReg >= 0 || destReg> 4) 
		{
			
			destReg = destinationReg;
		}
		else
		{
			destReg = 0;
		}
			
	}
	
	/*
	 * Execute the instruction
	 * */
	
	@Override
	public void execute(Environment env) 
	{
		//Store the value into destination register
		
		env.setRegister(destReg, value);  
	}
	
}
