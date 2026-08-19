package edu.dallascollege;

import java.io.*;
import java.util.Scanner;

/**
 * ==========ToyLang===========================
 *This program reads commands from script file, 
 *process them using Environment object, 
 *and write output to both console and a log file 
 */
public class Interpreter {

	public static void main(String[] args) throws IOException {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		//Ask a user for script filename
		
		System.out.println("Enter the input script filename:");
		String scriptFile = keyboard.nextLine();
		
		//As a user for the output log filename
		
		System.out.println("Enter the output log filename:");
		String logFile = keyboard.nextLine();
		
		
		//Create a File object using a filename entered by the user
		
		File inputFile = new File(scriptFile);
		
		
		// Create a Script object to read commands from the script file
		
		Script script = new Script(inputFile);
		
		
		//Create PrintWriter object to write to the log file
		
		PrintWriter outputFile = new PrintWriter(logFile);
		
		//Create an Environment object to store memory values
		
		Environment env = new Environment();
		
		//Processing commands to  the end of the file
		
		
		while(script.hasNext()) 
		{
			//Read next line from the script file
			String line = script.next();
			
			
			//Split line into separate pieces
			String[] parts = line.split(" ");
			
			
			//The first piece in the command
			String command = parts[0];
			
			
			//Store the value into memory A
			if(command.equals("SET_A")) 
			{
				int value = Integer.parseInt(parts[1]);
				env.setMemoryA(value);
			}
			
			//Store the value into memory B
			else if(command.equals("SET_B")) 
			{
				int value = Integer.parseInt(parts[1]);
				env.setMemoryB(value);
			}
			
			//Load value stored in memory A
			
			else if(command.equals("LOAD_A")) 
			{
				int value = env.getMemoryA();
				env.setAccumulator(value);
			}
			
			//Load value stored in memory B
			
			else if(command.equals("LOAD_B")) 
			{
				int value = env.getMemoryB();
				env.setAccumulator(value);
			}
			
			//ADD memoryA and memoryB
			
			else if (command.equals("ADD")) 
			{
				int memoryA = env.getMemoryA();
				int memoryB = env.getMemoryB();
				
				int sum = memoryA + memoryB;
				env.setAccumulator(sum);
			}
			
			//Subtract memoryB from memory A
			
			else if (command.equals("SUB")) 
			{
				int memoryA = env.getMemoryA();
				int memoryB = env.getMemoryB();
				
				int difference = memoryA - memoryB;
				env.setAccumulator(difference);
			}
			
			//Multiply memoryA by memoryB
			
			else if (command.equals("MUL")) 
			{
				int memoryA = env.getMemoryA();
				int memoryB = env.getMemoryB();
				
				int product = memoryA * memoryB;
				env.setAccumulator(product);
			}
			
			//Divide memoryA by memoryB
			
			else if (command.equals("DIV")) 
			{
				int memoryA = env.getMemoryA();
				int memoryB = env.getMemoryB();
				
				int quotient = memoryA / memoryB;
				env.setAccumulator(quotient);
			}
			
			
			//Display the accumulator value
			
			else if (command.equals("OUT")) 
			{
				int accumulatorValue = env.getAccumulator();
				
				System.out.println("OUTPUT:" + accumulatorValue);
				outputFile.println("OUTPUT:" + accumulatorValue);
				
			}
			
		}
		
		//Closing script file, log file and keyboard Scanner
		
		script.close();
		outputFile.close();
		keyboard.close();
		
	}

}
