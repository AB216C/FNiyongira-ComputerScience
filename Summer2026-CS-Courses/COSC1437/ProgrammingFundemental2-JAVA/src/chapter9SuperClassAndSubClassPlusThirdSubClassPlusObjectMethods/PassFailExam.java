package chapter9SuperClassAndSubClassPlusThirdSubClassPlusObjectMethods;

/*
 * Suppose we wish to extend this class with another class that is even more specialized.
 *  For example, the PassFailExam class, shown in Code Listing 9-22, determines a passing or failing grade for an exam. 
 * It has fields for the number of questions on the exam (numQuestions), the number of points each question is worth (pointsEach), 
 * and the number of questions missed by the student (numMissed).
 * */



 /**
  * This class determines a passing or failing grade for
  * an exam.
  */

public class PassFailExam extends PassFailActivity{
	
	private int numQuestions;  //Hold number of questions
	private double pointsEach;     //Points for each question
	private int numMissed;			//Number of questions missed
	
	
	  /**
	   * The constructor accepts as arguments the number
	   * of questions on the exam, the number of    
	   * questions the student missed, and the minimum 
	   * passing score.
	   */
	
public PassFailExam(int questions, int missed, double minPassing) 
{
	//Call the super class constructor
	
	super(minPassing);
	
	
	//Declare a local variable for a numeric score
	
	double numericScore;
	
	
	
	//set numQuestions and numMissed field
	
	numQuestions = questions;
	numMissed = missed;
	
	//Calculate the points for each question and the numeric score for this exam
	
	pointsEach = 100.0/questions;
	numericScore = 100.0 - (missed*pointsEach);
	
	//Call the superClass's set method to set numeric score
	
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

/*
 * The PassFailExam class inherits the PassFailActivity class’s members, 
 * including the ones that PassFailActivity inherited from GradedActivity
 * */


