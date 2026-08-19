package chapter5FileReadPrimitiveValues;

import java.util.Scanner;
import java.io.*;


/**
 This program read a series of numbers from file and accumulate their sum
 */

public class FileSum {
	
	
	private double sum;     //Accumulator
	
	
	
	
	
	/*
	 * The constructor accept the filename as its argument
	 * The file is opened, the numbers are ready from it
	 * Their sum is stored in sum field
	 * */
	
	public FileSum (String filename) throws IOException
	{
		
		String str;
		
		
		//Create the necessary object for file input
		
		File file = new File(filename);
		
		Scanner inputFile = new Scanner(file);
		
		
		//Initialize accumulator
		
		sum = 0.0;
		
		
		//Read all values form the file and calculate their totals
		
		while(inputFile.hasNext()) 
		{
			
			double number = inputFile.nextDouble();
			
			//Add sum to a number
			
			sum = sum + number;
		}
		
		
		inputFile.close();
		
	}
	
	//The getSum method returns the value in the sum field
	
	public double getSum() 
	{
		return sum;
	}
	
}
