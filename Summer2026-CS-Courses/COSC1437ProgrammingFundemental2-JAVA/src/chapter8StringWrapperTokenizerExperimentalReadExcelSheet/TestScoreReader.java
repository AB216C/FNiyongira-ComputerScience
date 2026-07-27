package chapter8StringWrapperTokenizerExperimentalReadExcelSheet;

/*
 *Professor Harrison keeps her students’ test scores in a Microsoft Excel spreadsheet. 
 *Figure 8-3 shows a set of five test scores for five students. Each column holds a test score, and each row represents the scores for one student.

Figure 8-3 Microsoft Excel spreadsheet

A   B   C   D   E   F G  E  F
87 79  91  82 94
72 79  81  74 88
94 92  81  89 96
77 56  67  81 79
79 82  85  81 90

Figure 8-3 Full Alternative Text
In addition to manipulating the scores in Excel, Dr. Harrison wants to write a Java application that accesses them. 
Excel, like many commercial applications, has the ability to export data to a text file. 
When the data in a spreadsheet is exported, each row is written to a line, and the values in the cells are separated by commas.
 For example, when the data shown in Figure 8-3 is exported, it will be written to a text file in the following format:

87,79,91,82,94
72,79,81,74,88
94,92,81,89,96
77,56,67,81,79
79,82,85,81,90

This is called the comma separated value file format. 
When you save a spreadsheet in this format, Excel saves it to a file with the .csv extension.
 Dr. Harrison decides to export her spreadsheet to a .csv file, then write a Java program that reads the file. 
 The program will use the String class’s split method to extract the test scores from each line, and a wrapper class to convert the tokens to numeric values.
  As an experiment, she writes the TestScoreReader class shown in Code Listing 8-10. 
 */

import java.util.Scanner;
import java.io.*;		//For file and IOException

 /**
  * The TestScoreReader class reads test scores as
  * tokens from a file and calculates the average
  * of each line of scores.
  */

public class TestScoreReader {
	private Scanner inputFile;
	private String line;
	
	
	   /**
	   * The constructor opens a file to read
	   * the grades from.
	   */
	
	public TestScoreReader(String filename) throws IOException 
	{
		File file = new File(filename);
		inputFile = new Scanner(file);
		
	}
	
	   /**
	   * The readNextLine method reads the next line
	   * from the file.
	   */
	
	public boolean readNextLine() throws IOException
	{
		boolean lineRead;	//flag variable
		
		//Determine whether there is more to read
		
		lineRead = inputFile.hasNext();
		
		// If so, read the next line
		
		if(lineRead)
			line = inputFile.nextLine();
		return lineRead;
		
	}
	
	
	   /**
	   * The getAverage method calculates the average
	   * of the last set of test scores read from the file.
	   */
	
	public double getAverage() 
	{
		int total = 0;		//Accumulator
		double average;		//Average test score
		
		//Tokenize the last lineRead from the file
		
		String[] tokens = line.split(",");
		
		//Calculate the total of the test score
		
		for (String str:tokens) 
		{
			total += Integer.parseInt(str);
		}
		
		
		  // Calculate the average of the scores.
		  // Use a cast to avoid integer division.
		
		average = (double) total/tokens.length;
		
		//return average
		
		return average;
		
	}
	
	
	/*
	 * The close method close file
	 * */
	
	public void close() throws IOException 
	{
		inputFile.close();
	}
	
	
	

}





