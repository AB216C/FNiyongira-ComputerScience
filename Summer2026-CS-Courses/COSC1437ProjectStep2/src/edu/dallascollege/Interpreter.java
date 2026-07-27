package edu.dallascollege;

import java.io.*;
import java.util.Scanner;

/*
 * ToyLang Interpreter
 * Read a script file and executes each instruction in order
 * 
 * */

public class Interpreter {

	public static void main(String[] args) throws IOException {
		
		//Create a scanner object to read user input
		
		Scanner keyboard = new Scanner(System.in);
		
		//Ask the user for the input script file name
		
		System.out.print("Enter the input script filename: ");
		
		String scriptFileName = keyboard.nextLine();
		
		//Ask the user for the output log file name
		
		System.out.print("Enter the output log filename: ");
		
		String logFileName = keyboard.nextLine();
		
		
		//Create the output log file
		
		PrintWriter logger = new PrintWriter(logFileName);
		
		//Create the file object using the script file name
		
		File inputFile = new File(scriptFileName);
		
		//Create a Script object to read script file
		
		Script script = new Script(inputFile, logger);
				
		//Create the program environment from Environment class
		
		Environment env = new Environment();
		
		//Execute each instruction in the script
		
		while (script.hasNext()) 
		{
			//Get the next instruction
			Instruction instruction = script.next();
			
			//Execute the instruction
			instruction.execute(env);
			
		}
		
		//close the log file and keyboard
		logger.close();
		keyboard.close();
		
	}

}
