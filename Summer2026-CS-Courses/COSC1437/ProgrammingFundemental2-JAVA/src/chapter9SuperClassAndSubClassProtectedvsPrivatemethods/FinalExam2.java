package chapter9SuperClassAndSubClassProtectedvsPrivatemethods;

 /**
  * This class determines the grade for a final exam. The
  * numeric score is rounded up to the next whole number
  * if its fractional part is .5 or greater.
  */

public class FinalExam2 extends GradeActivity2{
	private int numQuestions;		//NUMBER OF QUESTIONS
	private double pointsEach;		//Points for each question
	private int numMissed;			//Number of questions missed
	
	
	   /**
	   * The constructor accepts as arguments the number
	   * of questions on the exam and the number of   
	   * questions the student missed.
	   */
	
	public FinalExam2(int questions, int missed) 
	{
		double numericScore;		//To calculate numeric score
		
		
		numQuestions = questions;
		numMissed = missed;
		
		
		//Calculate points for each question and 
		//The numeric score for this exam
		
		pointsEach = 100.0/questions;
		numericScore = 100.0-(missed*pointsEach);
		
		
		//call superclass's setScore methods to 
		//set the numeric score.
		
		setScore(numericScore);	
		
		adjustScore();
		
	}
	
	
	   /**
	   * The getPointsEach method returns the pointsEach
	   * field.
	   */
	
	public double getPointsEach()
	{
		return pointsEach;
	}
	
	
	   /**
	   * The getNumMissed method returns the numMissed 
	   * field.
	   */
	
	public int getNumMissed() 
	{
		return numMissed;
	}

	
	/*
	 * The adjustScore method adjusts a numeric score
	 * */
	
	
	
	public void adjustScore() 
	{
		double fraction;		//Fractional part of the score
		
		
		//Get fractional part of the score
		
		fraction = score - (int)score;
		
		
		//if the fraction part is 0.5 or greater, round the score up to the next whole number.
		
		
		if (fraction >= 0.5) 
		{
			score = score + (1.0 - fraction);
		}	
		
		
	}
	
	
}
