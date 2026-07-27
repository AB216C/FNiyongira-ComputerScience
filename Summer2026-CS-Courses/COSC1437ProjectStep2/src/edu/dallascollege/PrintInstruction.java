package edu.dallascollege;

import java.io.PrintWriter;

/*
 * The class prints either a register value
 * or a text stored in the environment
 * */

public class PrintInstruction extends Instruction 
{
	
	//Register to print(used for PRINT_REG)
	
	private int targetReg;
	
	// Writes output to the log file 
	
	private PrintWriter logger;
	
	/*
	 * Constructor: Initialize OpCode, target register, and log file
	 */
	
	public PrintInstruction(OpCode instructionCode, int registerToPrint, PrintWriter outputLogger) 
	{
		super(instructionCode);
		
		targetReg = registerToPrint;
		logger = outputLogger;
	
	}
	
	/*
	 * Execute the print instruction
	 * Print either a register  value or the stored the text
	 * 
	 * */
	
	@Override
	public void execute(Environment env) 
	{
		//Print the value stored in a register
		
		if(code == OpCode.PRINT_REG) 
		{
			int value = env.getRegister(targetReg);
			
			System.out.println(value);
			
			if(logger != null) 
			{
				logger.println(value);
			}
			
		}
		//Print the text stored in Environment
		
		else
		{
			String text = env.getTextBuffer();
			System.out.println(text);
			
			if(logger != null) 
			{
				logger.println(text);
			}
			
			
		}
		
	}

}
