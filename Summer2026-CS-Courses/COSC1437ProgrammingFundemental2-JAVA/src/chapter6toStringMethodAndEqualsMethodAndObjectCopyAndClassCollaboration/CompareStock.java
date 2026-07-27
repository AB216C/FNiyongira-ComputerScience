package chapter6toStringMethodAndEqualsMethodAndObjectCopyAndClassCollaboration;

public class CompareStock {

	public static void main(String[] args) {
		
		
		//Create two stock objects with same values
		
		
		
		Stock company1 = new Stock("XYZ", 9.62);
		Stock company2 = new Stock("XYZ", 9.62);
		
		
		//Use the equals method to compare the objects
		
		if(company1.equals(company2))
			System.out.println("Both objects are the same");
		else
			System.out.println("The objects are different");
		
	}

}
