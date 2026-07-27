package chapter73CreateObjectThatPassArray;
/*

Dr. LaClaire gives a set of exams during the semester in her chemistry class. 
At the end of the semester, she drops each student’s lowest test score before averaging the remaining scores. 
She has asked you to write a program that will read a student’s test scores as input and calculate the average with the lowest score dropped.
The following pseudocode shows the steps for calculating the average of a set of test scores with the lowest score dropped:

Calculate the total of the scores.
Find the lowest score.
Subtract the lowest score from the total. This gives the adjusted total.
Divide the adjusted total by (number of scores – 1). This is the average.

You decide to create a class named Grader, with a constructor that accepts a double array of test scores. 
The Grader class will have a method named getLowestScore that returns the lowest score in the array, 
and a method named getAverage that returns the average of the test scores with the lowest score dropped.  

*/

 /**
   * The Grader class calculates the average
   * of an array of test scores, with the
   * lowest score dropped.
   */

 class Grader {
	 
	 //The testScore field is variable that will reference an array of test scores
	 
	 
	 private double[] testScores;
	 
	 
	 //Constructor: Accept an array of testScore as an argument
	 
	 
	 public Grader(double[] scoreArray) 
	 {
		 //Assign array argument to the testScore field
		 
		 testScores = scoreArray;
	 }
	 
	 
	 
	    /**
	    * The getLowestScore method returns
	    * the lowest test score.
	    */
	 
	 public double getLowestScore() 
	 {
		 
		 double lowest;       			//To hold the lowest score
		 
		 lowest= testScores[0];			//Get the first test score in the array
		 
		 //Step through the rest array, when a value less than the lowest is found, assign it to the lowest
		 
		 for (int index=0; index<testScores.length; index++) 
		 {
			 if (testScores[index]<lowest) 
			 {
				 lowest = testScores[index];
			 }
		 }
		 
		 return lowest;
	 }
	 
	 
	    /**
	    * The getAverage method returns the average of the
	    * test scores with the lowest score dropped.
	    */
	 
	 
	 public double getAverageScore() 
	 {
		 
		 double total = 0;		//To hold total
		 
		 double lowest;   //To hold the lowest score
		 
		 double average;				//To hold an average score
		 
		 
		 //if the array contain less than two test scores, display an error message and set average to 0
		 
		 
		 if (testScores.length<2)
		 {
			 System.out.println("ERROR: You must have at least two test scores");
			 
			 average = 0;
		 }
		 
		 else 
		 {
			 
			 
			 //Calculate the total of the score
			 
			 
			 for (double value :testScores)
				 total += value;
				 
			 
			 
			 //Get the lowest score the lowest score
			 
			 lowest= getLowestScore();
			 
			 
			 
			 //Substract the lowest from toal
			 
			 
			 total -=lowest;
			 
			 
			 //Calculate adjusted average
			 
			 
			 average = total/(testScores.length-1);
			 
			 
		 }
		 
		 //Calculate average from total and 
		 

		 return average;
		 
	 } 
	 
	 
}
