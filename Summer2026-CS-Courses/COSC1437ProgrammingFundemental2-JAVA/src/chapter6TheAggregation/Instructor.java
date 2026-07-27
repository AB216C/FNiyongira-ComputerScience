package chapter6TheAggregation;

//This class stores information about instructor

public class Instructor {
	
	private String lastName, 
				   firstName, 
				   officeNumber;
	
	/*
	 * This constructor accepts the arguments for the first name, last name and office number
	 * */
	
	public Instructor(String lname, String fname, String office) 
	{
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}
	
	
	
	/*
	 *  COPY CONSTRUCTOR
	 * */
	
	public Instructor(Instructor object2) 
	{
		lastName = object2.lastName;
		firstName = object2.firstName;
		officeNumber = object2.officeNumber;
		
	}
	
	
	/*
	 * SET METHOD TO SET EACH FIELD
	 * */
	
	public void set(String lname, String fname, String office) 
	{
		lastName = lname;
		firstName = fname;
		officeNumber = office;
	}
	
	/*toString method return a string containing the instructor information*/
	
	
	public String toString()
	{
		String str = "Last name: " + lastName 
				     +"\nFirst name: " + firstName
				     +"\nOffice number:" + officeNumber;
		
		return str;
	}
	

}
