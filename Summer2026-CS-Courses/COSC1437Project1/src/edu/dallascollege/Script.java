package edu.dallascollege;

import java.io.*;
import java.util.Scanner;


/**
 * This class will be responsible for reading commands 
 * from a script file one line at time
 * */

public class Script {
	
	
	//Scanner object...created to read the script file
	
	private Scanner scriptReader; 
	
	/*
	 * Constructor...created to open the the script file 
	 * and create a scanner to read from it
	 */
	public Script(File script) throws IOException 
	{
		scriptReader = new Scanner(script);
	}
	
	/*
	 * Checks whether there more lines to left to read from the script file
	 * return true if another line exist or false if it is the end of the file
	 * */
	
	public boolean hasNext() 
	{
		return scriptReader.hasNextLine();
	}
	
	/*
	 * Read and return the next line from the script file
	 */
	
	
	public String next() 
	{
		return scriptReader.nextLine();
	}
	
	
	/**
	 * When the program finishes reading the file, 
	 * the method below will close the Scanner
	 */
	
	
	public void close() 
	{
		scriptReader.close();
	}
	

}
