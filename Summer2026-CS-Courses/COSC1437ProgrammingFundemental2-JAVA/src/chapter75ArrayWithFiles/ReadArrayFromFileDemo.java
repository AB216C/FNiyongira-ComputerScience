package chapter75ArrayWithFiles;

import java.util.Scanner;

import java.io.*;

public class ReadArrayFromFileDemo {

	public static void main(String[] args) throws IOException {
		

		final int SIZE = 7;
		int[] numbers = new int[SIZE];
		int index = 0; // Loop control variable
		
		

		// Open the file.
		File file = new File("src/chapter75ArrayWithFiles/Values.txt");
		
		Scanner inputFile = new Scanner(file);
		
		

		// Read the file contents into the array.
		
		while (inputFile.hasNext() && index < numbers.length)
		{
		  numbers[index] = inputFile.nextInt();
		  index++;
		}

		// Close the file.
		
		inputFile.close();
		
		
		for (int num:numbers) 
		{
			System.out.println(num);
		}
		
	}

}
