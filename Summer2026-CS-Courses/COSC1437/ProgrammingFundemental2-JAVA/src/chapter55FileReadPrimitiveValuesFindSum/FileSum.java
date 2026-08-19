package chapter55FileReadPrimitiveValuesFindSum;

import java.util.Scanner;
import java.io.*;


/**
 This program read a series of numbers from file and accumulate their sum
 */

public class FileSum {
	
	
	private double sum;     //Accumulator
	
	
	
	public FileSum (String filename) throws IOException
	{
		
		
		
		//Create a file object
		
		File file = new File(filename);
		
		
		//Create file name if it doesn't exist
		
		
		
		
		
		
		Scanner inputFile = new Scanner(file);
		
		
		//Initialize accumulator
		
		
		sum = 0.0;
		
		//Read all values form the file and calculate their totals
		
		while(inputFile.hasNext()) 
		{
			System.out.println("Enter the numbers");
			double number = inputFile.nextDouble();
			
			//Add sum to a number
			
			sum = sum + number;
		}
		
		
		inputFile.close();
		
	}
	
	public double getSum() 
	{
		return sum;
	}
	
}
