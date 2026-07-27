package chapter5Notes;

public class ForLoopMultipleStatements {

	public static void main(String[] args) {
		
		int x, y; 
		
		//Two variables are initialized, but one is updated in the loop header
		
		for (x = 1, y = 1; x <=5; x++)
		{
			System.out.println(x + " plus " + y + " equals " + (x+y));
		}
		
		//Two variables are initialized and both are updated in the loop header
		
		System.out.println("Both are initailzed and updated");
		
		for (x = 1, y = 1; x <=5; x++, y++)
		{
			System.out.println(x + " plus " + y + " equals " + (x+y));
		}
	}

}
