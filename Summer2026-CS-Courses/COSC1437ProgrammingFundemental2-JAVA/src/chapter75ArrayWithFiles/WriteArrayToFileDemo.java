package chapter75ArrayWithFiles;

import java.io.*;

public class WriteArrayToFileDemo {

	public static void main(String[] args) throws IOException {
		

		int[] numbers = { 10, 20, 30, 40, 50, 55, 60 };
		
		// Open the file.
		
		System.out.println("Program started");
		PrintWriter outputFile = new PrintWriter("src/chapter75ArrayWithFiles/Values.txt");
		System.out.println("File opened");
		
		// Write the array elements to the file.
		
		for (int index = 0; index < numbers.length; index++)
		  outputFile.print(numbers[index] + " ");
		
		
		// Close the file.
		
		outputFile.close();
		
	}

}
