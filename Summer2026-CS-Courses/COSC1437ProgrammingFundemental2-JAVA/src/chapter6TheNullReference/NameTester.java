package chapter6TheNullReference;
/*
 * This program creates a Full Name object, then calls 
 * the object's getLength method before values are established for its reference field.
 * As a result this program will crash
 * */
public class NameTester {

	public static void main(String[] args) {
		

		//Create a full name object
		
		FullName  myName = new FullName();
		
		
		//Display the length of the name
		
		
		System.out.println(myName.getLength());
	}

}
