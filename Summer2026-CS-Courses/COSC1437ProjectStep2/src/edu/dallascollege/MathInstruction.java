package edu.dallascollege;

/*
 *  This class perform math using two registers 
 *  And store the result in another register
 * */

public class MathInstruction extends Instruction
{
	//First source register
	
	private int reg1;
	
	//Second source register
	
	private int reg2;
	
	//Destination register
	
	private int destReg;
	
	/*
	 * Constructor
	 */
	
	public MathInstruction(OpCode instructionCode, int register1, int register2, int destinationReg) 
	{
		//Call the parent constructor
		
		super(instructionCode);
		
		reg1 = register1;
		reg2 = register2;
		destReg = destinationReg;
		
	}
	
	/*
	 * Execute the math instructions
	 */
	
	@Override
	public void execute(Environment env) 
	{
		//Get values from two registers
		int value1 = env.getRegister(reg1);
		int value2 = env.getRegister(reg2);
		
		//Variable to store the result
		
		int result = 0;
		
		switch(getCode()) 
		{
		case ADD_REG:
			result = value1 + value2;
			break;
			
		case SUB_REG:
			result = value1 - value2;
			break;
			
		case MUL_REG:
			result = value1 * value2;
			break;
			
		case DIV_REG:
			result = value1/value2;
			break;
			
		default:
			System.out.println("Error: Invalid math operation");
			break;
			
		}
		
		//Store the result
		
		env.setRegister(destReg, result);
		
	}

}
