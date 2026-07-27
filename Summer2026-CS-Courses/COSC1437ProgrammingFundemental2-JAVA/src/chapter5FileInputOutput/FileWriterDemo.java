package chapter5FileInputOutput;

import java.util.Scanner;
import java.io.*;             //Needed for PrintWriter and IOException


/**
 * This program write data to a file
 */
public class FileWriterDemo {

	public static void main(String[] args) throws IOException {          //Header shows the method is capable of throwing IOexception  errors
	
		
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
		
		PrintWriter outputFile = new PrintWriter("fileName");       //The file is now open and connected to the PrintWriter object
		
		
		//WRITING THE FILE
		
		
		for (int i = 1; i<= numFriends; i++) 
		{
			System.out.println("Enter friend number " + i + " 's name:");
			friendName = keyboard.nextLine();
			
			outputFile.println(friendName);
			
		}
		
		outputFile.close();
		System.out.println("The file containing names has been created.");

		
	}

}
