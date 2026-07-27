package chapter9SuperClassAndSubClassPlusThirdSubClassPlusObjectMethods;

/**
2  * This program demonstrates the toString and equals
3  * methods that are inherited from the Object class.
4  */

public class ObjectMethods {

	public static void main(String[] args) {
		

		//Create two objects
		
		
		PassFailExam exam1 = new PassFailExam(0, 0, 0);
		
		PassFailExam exam2 = new PassFailExam(0,0,0);
		
		//Send the object to println, which will call the toString methods
		
		System.out.println(exam1);
		System.out.println(exam2);
		
		//Test the equals methods
		
		if (exam1.equals(exam2)) 
		{
			System.out.println("Both objects are the same");
		}
		else
		{
			System.out.println("Both objects are differnt");
		}
	}

}
