package chapter6TheAggregation;

//This class store information about the course
public class Course {
	
	private String courseName;			//Name of the course
	private Instructor instructor;		//Instructor
	private TextBook textbook;			//Textbook
	
	
	/*
	 * This constructor accept the arguments for the course name, instructor, and textbook
	 * */
	
	
	public Course(String name, Instructor instr, TextBook text)
	{
		
		//Assign the course name
		courseName = name;
		
		
		//Create instructor object
		//Passing instr as an argument to the copy constructor of the Instructor class
		/*instructor = instr;      //THIS WILL CAUSE SECURITY HOLES*/
		instructor = new Instructor(instr);
		
		
		//Create a textbook object
		//Passing text as an argument to copy constructor of the Textbook class
		/*textbook = text;    //This will cause security holes*/
		textbook = new TextBook(text);
		
		
	}
	
	/*
	 * Get name method
	 * */
	
	
	public String getName() 
	{
		return courseName;
	}
	
	/*
	 * get instructor method
	 * */
	
	
	public Instructor getInstructor()
	{
		/*return instructor;    //This cause security holes*/
		return new Instructor(instructor);
	}
	
	/*
	 * get textbook method
	 * */
	
	
	public TextBook getTextBook() 
	{
		/*return textbook;        //This causes security holes*/
		return new TextBook(textbook);
		
		
	}
	
	
	/*The toString method: return a string containing a course information*/
	
	public String toString()
	{
		String str = "Course name:" + courseName 
					 +"\nInstructor information:\n" + instructor
					 +"\nText book information:\n" + textbook;
		
		return str;
	}
	
}
