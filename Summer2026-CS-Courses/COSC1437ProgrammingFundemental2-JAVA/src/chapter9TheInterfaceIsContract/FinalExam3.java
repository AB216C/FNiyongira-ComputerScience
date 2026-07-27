package chapter9TheInterfaceIsContract;


/* the code for the FinalExam3 class, which implements the Relatable interface.
 *  The equals, isGreater, and isLess methods compare the calling object with the object passed as an argument.*/

public class FinalExam3 extends GradedActivity implements Relatable
{
	private int numQuestions;		//Number of questions
	private double pointsEach;		//Points for each question
	private int numMissed;			//Questions missed
	
	/*
	 * The constructor set the number of questions on the exam and the number of questions missed
	 * */
	
	
	public FinalExam3(int questions, int missed) {
		
		double numericScore;			//To hold a numeric score
		
		numQuestions = questions;
		numMissed = missed;
		
		
		
		//Calculate the points for each question and numeric score for this exam
		
		pointsEach = 100.0/questions;
		numericScore = 100.0 - (missed*pointsEach);
		
		//cALL THE INHERITED setScore() method to store the numeric score
		
		setScore(numericScore);
		
	}
	
	
	   /**
	    * The getPointsEach method returns the number of
	    * points each question is worth.
	    */

	
	public double getPointEach() 
	{
		return pointsEach;
	}
	
	
	    /**
	    * The getNumMissed method returns the number of 
	    * questions missed.
	    */
	
	 
	 public int getNumMissed() 
	 {
		 return numMissed;
	 }
	 
	 
	 /*
	  * The equals methods compare the calling object to the argument object for equality
	  * */
	 
	 
	 public boolean equals(GradedActivity g) 
	 {
		 boolean status;
		 
		 
		 if (this.getScore() == g.getScore()) 
		 {
			 status = true;
		 }
		 else 
		 {
			 status = false;
		 }
		 
		 return status;
	 }
	 
	 
	 /*
	  * The isGreader than method determine whether the calling object is grater than the argument object
	  * 
	  * */
	 
	 
	 public boolean isGreater(GradedActivity g) 
	 {
		 boolean status;
		 
		 
		 if (this.getScore() > g.getScore()) 
		 {
			 status = true;
		 }
		 else 
		 {
			 status = false;
		 }
		 
		 return status;
	 }
	 
	 
	 
	 /*
	  * The isLess method determines whether the calling object is less than the argument object
	  * */
	 
	 
	 public boolean isLess(GradedActivity g) 
	 {
		 boolean status;
		 
		 
		 if (this.getScore() < g.getScore()) 
		 {
			 status = true;
		 }
		 else 
		 {
			 status = false;
		 }
		 
		 return status;
	 }
	 
	 
	 
	 
	
	
	
}
