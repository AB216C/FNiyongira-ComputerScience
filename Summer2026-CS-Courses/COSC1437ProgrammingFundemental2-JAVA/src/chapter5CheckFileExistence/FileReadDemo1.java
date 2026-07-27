package chapter5CheckFileExistence;

import java.util.Scanner;     //Needed for scanner
import java.io.*;              //Needed for File and IOException

/*
 * This program read data from file
 * */

public class FileReadDemo1 {

	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the file name");
		
		String filename = keyboard.nextLine();
		
		
		//Creating a File object
		
		File file = new File(filename);
		
		
		//CHECK IF THE FILE EXIST
		
		
		if(!file.exists()) 
		{
			System.out.print("The file " + filename + " does not exist");
			
			//Exit the program
			
			System.exit(0);
		}
		
		
		Scanner inputFile = new Scanner(file);
		
		//Open the file
		
		
		while (inputFile.hasNext()) 
		{
			String friendName = inputFile.nextLine();
			
			//Display the last name.
			
			System.out.println(friendName);
			
		}
		
		//Close the file
		
		inputFile.close();
		
		
		
		
	}

}
