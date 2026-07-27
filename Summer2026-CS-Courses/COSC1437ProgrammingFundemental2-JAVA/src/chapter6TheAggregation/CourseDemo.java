package chapter6TheAggregation;

//This program demonstrate the course class

public class CourseDemo {

	public static void main(String[] args) {
		
		//Create an instructor object
		
		Instructor myInstructor = new Instructor("Mary", "Ineza", "RH30210");
		
		
		
		
		
		
		//Create a textbook object
		
		
		TextBook myTextbook = new TextBook("Starting out with Java", "Gardis", "Pearson");
		

		
		
		//Create a course object
		
		
		Course myCourse = new Course("Intro to Java", myInstructor, myTextbook);
		
		
		//Display the course information
		
		
		System.out.println(myCourse);
		
		
	}

}
