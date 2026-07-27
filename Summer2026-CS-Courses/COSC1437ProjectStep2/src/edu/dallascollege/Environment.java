package edu.dallascollege;

/*
 * This program stores the program's registers and text
 * */

public class Environment 
{
	
	private int[] registers;			//Memory registers

	private String textBuffer;          //Stores text for PRINT_TEXT
			
	
	/*
	 * Constructor: Create 5 registers and empty text
	 */
	public Environment() {
		registers = new int[5];
		textBuffer = "";
		
	}
	
	/*
	 * Store a value in a register 
	 * */
	
	public void setRegister(int index, int value) 
	{
		
		registers[index] = value;
	}
	
	/*
	 * Return the value from a register
	 */
	
	public int getRegister(int index) 
	{
		return registers[index];
	}
	
	/*
	 * Save the text into the text buffer 
	 */
	
	public void setTextBuffer(String text) 
	{
		textBuffer = text;
	}
	
	/*
	 * Return a stored text
	 */
	
	public String getTextBuffer() 
	{
		return textBuffer;
	}
}
