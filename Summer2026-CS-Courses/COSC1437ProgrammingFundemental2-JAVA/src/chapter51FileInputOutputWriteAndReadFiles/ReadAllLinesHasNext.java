package chapter51FileInputOutputWriteAndReadFiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAllLinesHasNext {


	public static void main(String[] args) throws IOException {
		
		
		int numFriends;
		String friendName;
		String fileName;
	
		
		Scanner  keyboard = new Scanner(System.in);
		
		
		System.out.println("How many friends planning to receive in the party?");
		
		numFriends = keyboard.nextInt();
		
		keyboard.nextLine();      //Consuming the next line
		
	
		System.out.println("Enter the name of the file:");
		
		fileName = keyboard.nextLine();
		
		
		//Opening the file
		
		PrintWriter outputFile = new PrintWriter(fileName);       //The file is now open and connected to the PrintWriter object
		
		
		//WRITING THE FILE
		
		
		for (int i = 1; i<= numFriends; i++) 
		{
			System.out.println("Enter friend number " + i + " 's name:");
			friendName = keyboard.nextLine();
			
			outputFile.println(friendName);
			
		}
		
		outputFile.close();
		System.out.println("The file containing names has been created.");
		
		
		
		//READING THE FIRST LINE INTHE FILE
		
		System.out.println("Enter the file name");
		
		
		String filename = keyboard.nextLine();
		
		
		//OPENING THE FILE
		
		File myFile = new File(filename);
		
		
		Scanner inputFile = new Scanner(myFile);
		
		
		
		//Read the first line from the file
		
//		
//		String line = inputFile.nextLine();
		
		
		//Display the first line
		
//		System.out.println("The first line of the file is as follows:");
//		System.out.println(line);
		
		
		// DISPLAYING ALL LINES
		
		System.out.println("Printing All lines \n");
		
		
		while(inputFile.hasNext()) 
		{
			friendName = inputFile.nextLine();
			System.out.println(friendName);
		}
		
		//close the file
		inputFile.close();
		
	}


}
