package edu.dallascollege;

/*This class store the text into the environment*/

public class TextInstruction extends Instruction
{
	
	private String text;		//A text to store
	
	
	/*
	 * Constructor
	 */
	
	public TextInstruction(String inputText) 
	{
		
		//This instruction is always SET_TEXT
		
		super(OpCode.SET_TEXT);
		
		text = inputText;
	}
	
	/*
	 * Save the text into environment
	 */
	
	@Override
	public void execute(Environment env) 
	{
		env.setTextBuffer(text);
	}

}
