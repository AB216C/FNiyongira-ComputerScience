package chapter21PerformanceOfSetsAndLists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.File;

public class CountKeywords {

	public static void main(String[] args) throws Exception {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a Java source file: ");
		
		String filename = input.nextLine();
		
		
		File file = new File(filename);
		
		
		if(file.exists()) 
		{
			System.out.println("The number of keywords in " + filename + " is " + countKeywords(file));
		}
		else
		{
			System.out.println("File " + filename + " does not exisit");
		}

		System.out.println(file.getAbsolutePath());
		
	}

	
	
	public static int countKeywords(File file) throws Exception
	{
		
		//Array of all java keywords + true, false and null
		
		String[] keywordString = 
			{
					"abstract","assert","boolean", "break","byte","catch",
					"case", "char","char","const","continue", "default",
					"do","double","else", "enum","extends","for","final", 
					"finally","float","goto","if", "implments","import",
					"instanceof","int", "interface","long","native","new", 
					"package","private","protected","public", "return",
					"short","static","strictfp", "switch","super",
					"synchronized","this", "throw","throws","transient","try",
					"void","volatile","while","true", "while","true","false","null"
			};
		
		
		Set<String> keywordSet	= new HashSet<>(Arrays.asList(keywordString));
		
		int count = 0;
		
		Scanner input = new Scanner(file);
		
		
		while(input.hasNext()) 
		{
			String word = input.next();
			
			if(keywordSet.contains(word)) 
			{
				count++;
			}
			
		}
		
		return count;
		
	}
}
