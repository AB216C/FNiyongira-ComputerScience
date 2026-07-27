package chapter8StringWrapperTokenizerExperimentalReadExcelSheet;
/*
 * The constructor accepts the name of a file as an argument and opens the file.
 *  The readNextLine method reads a line from the file and stores it in the line field. 
 *  The method returns true if a line was successfully read from the file, or false if there are no more lines to read. 
 *  The getAverage method tokenizes the last line read from the file, converts the tokens to double values, and calculates the average of the values. 
 *  The average is returned. 
 *  The program in Code Listing 8-11 uses the TestScoreReader class to open the file Grades.csv and get the averages of the test scores it contains.
 * */

import java.io.*;

 /**
  * This program uses the TestScoreReader class to read
  * test scores from a file and get their averages.
  */


public class TestAverages {

	public static void main(String[] args) throws IOException{
		double average;		   //To hold an average
		int studentNumber=1;   //To count students
		
		//Create a TestScoreReader object
		
		TestScoreReader scoreReader  = new TestScoreReader("src/Grades.csv");
		
		//Process the file contents
		
		while(scoreReader.readNextLine()) 
		{
			//Get this student's average
			
			average = scoreReader.getAverage();
			
			//Display this student's average
			
			System.out.println("The average for student " + studentNumber + " is " + average );
			
			//Increment the student's number
			
			studentNumber++;
			
			//Close the file
			

		}
		
		scoreReader.close();
		
		System.out.println("No more score");
	
		
	}

}
