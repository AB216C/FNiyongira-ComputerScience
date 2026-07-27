package Chapter78SequentialSearchAlgorithm;

/*
 * complete program that uses the SearchArray class. 
 * It searches the five-element array tests to find a score of 100.
 */


 /**
  * This program demonstrates the SearchArray class's
  * sequentialSearch method.
  */
public class TestSearch {

	public static void main(String[] args) {
		
		int results;
		
		
		//Create an array of values
		
		
		int[] tests = {87,75, 98,100, 82};
		
		//Search the array for the value 100
		
		results = SearchArray.sequentialSearch(tests, 100);
		
		
		
		// Determine whether -1 was found in the array
		
		if (results == -1) 
		{
			System.out.println("You did not earn 100 on any test");
		}
		else
		{
			System.out.println("You earned a 100 on a test#" + (results + 1));
		}
		
		
	}

}
