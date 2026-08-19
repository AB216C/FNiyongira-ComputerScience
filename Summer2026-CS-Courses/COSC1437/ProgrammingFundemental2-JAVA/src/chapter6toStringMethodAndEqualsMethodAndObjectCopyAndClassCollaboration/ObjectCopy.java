package chapter6toStringMethodAndEqualsMethodAndObjectCopyAndClassCollaboration;

/*
 * This program uses the stock class's copy method to create 
 * a copy of a stock object 
*/

public class ObjectCopy {

	public static void main(String[] args) {
		
		//Create a stock object
		
		Stock company1 = new Stock("XYZ", 9.62);
		
		
		//Declare a stock variable 
		
		Stock company2;
		
		
		
		//Make company two reference a copy of the object
		//referenced by the company1
		
		company2 = company1.copy();
		
		
		//Display the content of both objects
		
		System.out.println("Company1:\n" + company1);
		System.out.println();
		System.out.println("Company2:\n" + company2);
		
		
		
		//Confirm if we actually have two objects
		
		if (company1 == company2) 
		{
			System.out.println("The Company1 and company2 varibles reference the same object");
		}
		else
			System.out.println("The Company1 and company2 variables reference differnt objects");
		
		
		
		/*Notice on the next CODES, OUTPUT WILL BE: REFERENCE 
		 *THE SAME OBJECTS because of using predefined equals method in stock class*/
		
		
		if (company1.equals(company2)) 
		{
			System.out.println("The Company1 and company2 varibles reference the same object");
		}
		else
			System.out.println("The Company1 and company2 variables reference differnt objects");
		
	}

}
