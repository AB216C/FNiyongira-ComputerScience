package Assignment1;

import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.LinkedHashMap;

public class FerdinandNiyongiraAssignment1 {
	
	public static String ferdinandNiyongiraRecursion(String word) 
	{
		//Base case : Stop recursion when no more characters
		 
		if(word.length()==0) 
		{
			return "";
		}
		
		
		//Recursive Case: Capitalize the first character of the current word
		//Get first letter
		
		char firstLetter = word.charAt(0);
		
		//Capitalize the first letter
		
		char capitalizedFirstLetter = Character.toUpperCase(firstLetter);
		
		//Recursive call: capitalized first character get concatenated 
		//with the result returned by the recursive call
		
		return capitalizedFirstLetter + ferdinandNiyongiraRecursion(word.substring(1)); 
		
		
	}
	
	public static List<String> ferdinandNiyongiraCreateList(String filename) throws IOException
	{
		//Create File object to identify the file
		File file = new File(filename);
		
		//Check if the file exist signal the user if it doesn't
		if(!file.exists()) 
		{
			System.out.println("The file " + filename + "doesn't exist");
			
			System.exit(0);
		}
		
		
		//Create Scanner object to read the file
		Scanner inputFile = new Scanner(file);
		
		
		//Create a List object to store capitalized string objects
		
		List<String> ferdinandNiyongiraList = new ArrayList<>();
		
		
		//Read the remaining lines in the file; read one line at time
		while(inputFile.hasNextLine())
		{
			//Read one line from Assignment1DataFile.txt
			
			String line = inputFile.nextLine();
			
			
			//Split the line into individual words and store tokens in into the String array
			
			String[] arrayOfStrings = line.split("[ .,()/\\s:]+");
			
			
			//Capitalize each word in the array using ferdinandNiyongiraRecursion method
			//Add all capitalized words from line to the ferdinandNiyongiraList
			
			String capitalizedWord = "";
			
			for (String word:arrayOfStrings) 
			{
				
				capitalizedWord = ferdinandNiyongiraRecursion(word);
				ferdinandNiyongiraList.add(capitalizedWord);
			}
		
		}
	
	
		inputFile.close();
		
		//return a List of capitalized words
		return ferdinandNiyongiraList;
		
	}
	
	
	public  static Set<String> ferdinandNiyongiraCreateSet(String filename) throws IOException
	{
		
		//Create a list containing all capitalized words from the file
		List<String> ferdinandNiyongiraList = ferdinandNiyongiraCreateList(filename);
		
		//Create a linkedHashSet to remove all duplicates from the list
		//while retaining the original insertion order
		Set<String> ferdinandNiyongiraSet = new LinkedHashSet<>(ferdinandNiyongiraList);
		
		//Return a set of unique and capitalized words
		return ferdinandNiyongiraSet;
		
	}
	
	
	public static Map<String, Integer>  ferdinandNiyongiraCreateMap(String filename) throws IOException 
	{
		//Create a list containing all capitalized words from the file
		List<String> ferdinandNiyongiraList = ferdinandNiyongiraCreateList(filename);
		
		//Create a linkedHashSet to remove all duplicates from the list while retaining the original insertion order
		Set<String> ferdinandNiyongiraSet = new LinkedHashSet<>(ferdinandNiyongiraList);
		
		//Create a linkedHashMap to store each unique word and its number of occurrence
		Map<String, Integer> ferdinandNiyongiraMap = new LinkedHashMap<>();
		
		
		//Count occurrence of words in set using a list
		
		for (String word:ferdinandNiyongiraSet) 
		{
			int wordCount = 0;					//Initialize the occurrence counter
			
			//Compare the current unique word in the list with every word in the list
			for (String item:ferdinandNiyongiraList) 
			{
				//Once a match is found from the list, increment the wordCount counter
				if(word.equals(item)) 
				{
					wordCount ++;
				}
			}
			
			//Store a unique word and its occurrence count in the map
			ferdinandNiyongiraMap.put(word,wordCount);
		}
		
		//Return the map containing each unique word with its occurrence count
		return ferdinandNiyongiraMap;
		
	}
	

	public static void main(String[] args) throws IOException {
		
		//Test METHOD 1
		//Prompt the user to enter the name of the file 
		
		String filename;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the name of the file:");
		
		// read the file name entered by the user 
		//and store it in the variable: String filename 
		filename = keyboard.nextLine();
		
		//Create a list containing all capitalized words from the entered file
		List<String> ferdinandNiyongiraList = ferdinandNiyongiraCreateList(filename);
		
		System.out.println("LIST: ");
		
		
		//use for loop to traverse the List and print each word on a separate line
		for (String word:ferdinandNiyongiraList) 
		{
			//Print non-empty words
			if(!word.trim().isEmpty()) 
			{
				System.out.println(word);
			}

		}
		
		//Test METHOD 2
		System.out.println("\n======================================\n");
		
		//Create a LinkedHashSet with all duplicates removed 
		//while retaining the original insertion order
		Set<String> ferdinandNiyongiraSet = ferdinandNiyongiraCreateSet(filename);
		
		//Add unique and CAPITALIZED words to the linkedHashSet
		ferdinandNiyongiraSet.add("SUPPLY");
		ferdinandNiyongiraSet.add("CHAIN");
		ferdinandNiyongiraSet.add("SPECIALIZATION");
		
		//Use a loop to traverse the set and print each word on its individual line
		System.out.println("SET: ");
		for (String element:ferdinandNiyongiraSet) 
		{
			//print non-empty words
			if(!element.trim().isEmpty()) 
			{
				System.out.println(element);
			}

		}
		
		
		//Test Method 3
		System.out.println("\n======================================\n");
		
		//Create a linkedHashMap from the file to store each unique word 
		//and its number of occurrence
		Map<String,Integer> ferdinandNiyongiraMap = ferdinandNiyongiraCreateMap(filename);
		
	
		System.out.println("MAP: ");

		//Use forEach to traverse both key(word) and values(wordCount) and 
		// display individual key value pair in the console
		ferdinandNiyongiraMap.forEach((word,wordCount)->System.out.println(word + ":" + wordCount + " "));

	}

}
