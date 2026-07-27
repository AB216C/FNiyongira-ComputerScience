package chapter9InheritanceSuperClassOverriding;
/*
 * Most teachers assign various graded activities for their students to complete. 
 * A graded activity can be given a numeric score such as 70, 85, 90, and so on, and a letter grade such as A, B, C, D or F. 
 * Figure 9-2 shows a UML diagram for the GradedActivity class, which is designed to hold the numeric score of a graded activity. 
 * The setScore method sets a numeric score, and the getScore method returns the numeric score. 
 * The getGrade method returns the letter grade that corresponds to the numeric score.
 *  Notice that the class does not have a programmer-defined constructor, so Java will automatically generate a default constructor for it. 
 *  This will be a point of discussion later. 
 * Code Listing 9-1 shows the code for the class, and the program in Code Listing 9-2 demonstrates the class.
 * */

/*
 * A class that holds a grade for a graded activity
 * Grade activity class represent a general class
 * 
 * */
public class GradedActivity {
	
	private double score;		//Numeric score
	
	
	
	public void setScore(double s) {
		
		score = s;
	}
	
	public double getScore()
	{
		return score;
	}
	
	
	   /**
	   * The getGrade method returns a letter grade 
	   * determined from the score field.
	   */
	
	public char getGrade() 
	{
		char letterGrade;			//To hold grade
		
		if (score > 90)
			letterGrade = 'A';
		
		else if (score > 80)
			letterGrade = 'B';
		else if (score > 70)
			letterGrade = 'C';
		else if (score> 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		
		return letterGrade;
	}
}
