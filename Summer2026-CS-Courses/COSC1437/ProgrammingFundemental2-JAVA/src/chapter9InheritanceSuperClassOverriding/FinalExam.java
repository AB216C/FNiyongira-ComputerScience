package chapter9InheritanceSuperClassOverriding;

/*This class determine the grade for final exam*/

public class FinalExam extends GradedActivity{
	
	private int numQuestions;		//NUMBER OF QUESTIONS
	private double pointsEach;		//Points for each question
	private int numMissed;			//Number of questions missed
	
	
	   /**
	   * The constructor accepts as arguments the number
	   * of questions on the exam and the number of   
	   * questions the student missed.
	   */
	
	public FinalExam(int questions, int missed) 
	{
		double numericScore;		//To calculate numeric score
		
		
		numQuestions = questions;
		numMissed = missed;
		
		
		//Calculate points for each question and 
		//The numberic score for this exam
		
		pointsEach = 100.0/questions;
		numericScore = 100.0-(missed*pointsEach);
		
		
		//call superclass's setScore methods to 
		//set the numeric score.
		
		setScore(numericScore);	
		
		
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

	

}
