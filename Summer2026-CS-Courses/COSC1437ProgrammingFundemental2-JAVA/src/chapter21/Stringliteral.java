package chapter21;

public class Stringliteral {

	public static void main(String[] args) {
		
		// This is not encouraged
		
		System.out.println("Enter a value that is greater than zero and less than 10");
		
		// To solve the problem, you break the problem into small string literals using + operator 
		
		System.out.println("Enter a value that" +
				" is greater than zero " +
				"and less than 10");
		
		
		int apples;
		
		apples = 20;
		
		System.out.print("Today we sold " + apples +
				         " bushels of apples.");
	
		
	}

}
