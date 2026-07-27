package chapter9SuperClassAndSubClassPlusThirdSubClassPlusObjectMethods;

/*This program demonstrates polymorphic behavior*/

public class Polymorphic {

	public static void main(String[] args) {
		
		//Create an array of GradedActivity reference
		
		
		GradedActivity[] tests = new GradedActivity[3];		
		
		
		//The first test is a regular exam with a with a numeric score of 95.
		
		
		tests[0] = new GradedActivity();
		
		tests[0].setScore(95);
		
		
		
		    // The second test is a pass/fail test. The
		    // student missed 5 out of 20 questions, and the
		    // minimum passing grade is 60.
		
		
		tests[1] = new PassFailExam(20,5,60);
		
		
		// The third test is the final exam. There were
		// 50 questions and the student missed 7.
		
		tests[2] = new FinalExam(50,7);
		
		//Display the grades
		
		for (int index = 0; index < tests.length; index++ ) 
		{
			System.out.println("Test" + (index + 1) + ":" + 
								"score " + tests[index].getScore() + 
								" ,grade " + tests[index].getGrade());
		}
		
		
		
		/*
		 * This method’s parameter, g, is a GradedActivity variable.
		 *  But, it can be used to accept arguments of any type that inherits from GradedActivity.
		 *  For example, the following code passes objects of the FinalExam, PassFailActivity, and PassFailExam classes to the method:
		 * 
		 * */
		
		GradedActivity exam1 = new FinalExam(50,7);
		GradedActivity exam2 = new PassFailActivity(70);
		GradedActivity exam3 = new PassFailExam(100,10,70);
		
		displayGrades(exam1);
		displayGrades(exam2);
		displayGrades(exam3);
		
	}
	
	//You can also use parameters to polymorphically accept arguments to methods.
	//For example, look at the following method:
	
	public static void displayGrades(GradedActivity g) 
	{
		System.out.println("Score " + g.getScore() + ", grade " + g.getGrade());
	}
	

}
