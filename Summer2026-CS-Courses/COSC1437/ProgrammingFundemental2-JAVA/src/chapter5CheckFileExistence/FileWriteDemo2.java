package chapter5CheckFileExistence;

import java.util.Scanner;
import java.io.*;


/*
 * This program write data to a file
 * It makes sure specified file doesn't exist before opening
 * */
public class FileWriteDemo2 {

	public static void main(String[] args) throws IOException {
		
		
		String filename;            //File name
		String friendName;          //Friend's name
		int numFriends;             //Number of friends
		
		
		//Create a Scanner object for a keyboard input
		
		
		Scanner keyboard = new Scanner(System.in);

		
		// Get number of friends
		
		System.out.println("how many friends do you have?");
		
		numFriends = keyboard.nextInt();
		
		
		//Consume the remaining new line character since nextInt is on the previous line
		
		keyboard.nextLine();
		
		
		//Ask use to enter the file name
		
		System.out.println("Enter the file name");
		
		filename = keyboard.nextLine();
		
		
		//Get the file name
		//Create the file object
		
		File file = new File(filename);
		
		
		//Check if the file exist
		
		if(file.exists()) 
		{
			System.out.println("The file"+ filename +" already exists");
			//Exit the program
			
			System.exit(0);
		}
		
		
		//Open the file
		
		PrintWriter outputFile = new PrintWriter(file);
		
		
		for (int i = 1; i<= numFriends; i++) 
		{
			System.out.println("Enter friend name number" + i + ":");
			friendName = keyboard.nextLine();
			
			
			//Write the name to the file
			
			outputFile.println(friendName);
		}
		
		//Close the file
		
		outputFile.close();
		System.out.println("Data has been written to the file");
		
	}

}
