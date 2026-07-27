package edu.dallascollege;

/*
 * This class reads a script file, convert each command into 
 * an instruction object, stores the instruction in a list, 
 * and provides access to them one a time
 */
import java.io.*;
import java.util.*;

public class Script {
	
	//Keeps track of the current instruction being executed
	private int currentInstruction;
	
	//Stores  all instructions read from the script file
	private ArrayList<Instruction> instructions;
	
	public Script(File script, PrintWriter logger) throws IOException
	{
		//Initialize the instruction list and instruction counter
		instructions = new ArrayList<>();
		currentInstruction = 0;
		
		//Open the script file for reading
		Scanner reader = new Scanner(script);
		
		//Read the script one line at time

		while (reader.hasNextLine()) 
		{
			String line = reader.nextLine();
			
			//Ignore blank lines
			
			if(line.trim().isEmpty())
				continue;
			
			//Handle SET_TEXT separately because it contains quoted text
			
			if(line.startsWith("SET_TEXT")) 
			{
				//Locate the the opening and closing quotation marks
				int firstQuote = line.indexOf("\"");
				int lastQuote = line.lastIndexOf("\"");
						
				//Extract the text between quotation marks
				String text = line.substring(firstQuote + 1, lastQuote);
			
				//Create and store TextInstruction object
				instructions.add(new TextInstruction(text));
			
			}
			else 
			{
				//Break command into pieces
				String[] parts = line.split(" ");
				
				//Determine which instruction to create
				switch(parts[0]) 
				{
				case "LOAD_VAL":
					//Create a ValueInstruction using the register and value
					instructions.add(new ValueInstruction(
							Integer.parseInt(parts[1]), 
							Integer.parseInt(parts[2])));
					break;
					
					
				case "ADD_REG":
					//Create a mathInstruction for addition
					instructions.add(new MathInstruction(
							OpCode.ADD_REG, 
							Integer.parseInt(parts[1]), 
							Integer.parseInt(parts[2]), 
							Integer.parseInt(parts[3])));
					break;
					
				case "SUB_REG":
					//Create a mathInstruction for subtraction
					instructions.add(new MathInstruction(
							OpCode.SUB_REG,
							Integer.parseInt(parts[1]),
							Integer.parseInt(parts[2]),
							Integer.parseInt(parts[3])
							));
					break;
				case "MUL_REG":
					//Create a mathInstruction for multiplication
					instructions.add(new MathInstruction(
							OpCode.MUL_REG,
							Integer.parseInt(parts[1]),
							Integer.parseInt(parts[2]),
							Integer.parseInt(parts[3])
							));
					break;
				case "DIV_REG":
					//Create a mathInstruction for division
					instructions.add(new MathInstruction(
							OpCode.DIV_REG,
							Integer.parseInt(parts[1]),
							Integer.parseInt(parts[2]),
							Integer.parseInt(parts[3])
							));
					
					break;
				case "PRINT_REG":
					//Create an instruction to print the value stored in a specific register
					instructions.add(new PrintInstruction(
							OpCode.PRINT_REG,
							Integer.parseInt(parts[1]), logger));
					break;
					
				case "PRINT_TEXT":
					//Create an instruction to print a line text in a script file
					instructions.add(new PrintInstruction(
							OpCode.PRINT_TEXT, 0, logger));
					break;
					
					
				default:
					//Display an error if the command is not recognized
					System.out.println("ERROR: Unknown command");
					
					if(logger!= null) 
					{
						logger.println("ERROR: Unknown command");
					}
				}
				
			}
			
		}
		//close the file after all instructions been read
		
		reader.close();
		
	}
	/*
	 * Determine whether there are more instructions available to execute
	 * */
	public boolean hasNext()
	{

		if( currentInstruction < instructions.size()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/*
	 * Return the next instruction in the list
	 * */
	
	public Instruction next() 
	{
		
		if(hasNext()) 
		{
			Instruction instruction = instructions.get(currentInstruction);
			
			//Move to the next instruction for the next call
			currentInstruction ++;
			
			return instruction;
		}
		else 
		{
			return null; //No instruction remains
		}
	}
	
}
