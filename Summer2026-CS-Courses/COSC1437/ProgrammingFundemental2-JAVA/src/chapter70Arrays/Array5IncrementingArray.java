package chapter70Arrays;

public class Array5IncrementingArray {

	public static void main(String[] args) {
		
		
		int[] scores = {7,8,9,10,11};
		
		
		//Increment a score at index 0
		
		scores[0]++;
		
		System.out.println(scores[0]);
		
		//Increment a score at index 1
		
		scores[1]++;
		
		System.out.println(scores[1]);
		
		//Declement a score at index 0
		
		scores[4]--;
		
		System.out.println("Declement for 11 is "+scores[4]);
		
		
		//Increment while printing
		
		System.out.println(scores[2]);
		System.out.println(scores[2]--);
		System.out.println(scores[2]);
		
		
		
		//Print all elements
		
		System.out.println("====================================================");
		
		
		System.out.println("Before increment:");
		
		for (int score:scores) 
		{
			System.out.println(score);
		}
		
		
		
		for (int index = 0; index< scores.length; index++) 
		{
			scores[index]++;
		}
		
		System.out.println("After increment:");
		for (int sc:scores) {
			System.out.println(sc);
		}
		
		
		//Pre-increment vs postincrement
		
		
		//Pre-increment and post increment provide same result when the value is being used in different expressions OR IN LOOPS
		
		System.out.println("\n=================PRE  VS POST INCREMENT AND DECREMENT\n");
		System.out.println("=======TWO OR EMORE EXPRESSIONS OR FOR LOOP==================");
		
		int[] numbers = {1,2,3,4};
		
		
			
		++numbers[0];							//Expression 1
		
		System.out.println("PreIncrement:Number 1 was changed to "+ numbers[0]);		//Expression 2
		
		numbers[1]++;							//Expression 1
		System.out.println("PostIncrement:Number 2 changed to "+ numbers[1]);			//Expression 2
		
		//Pre-decrement and post decrement provide same result when the value is being used in different expressions
		
		--numbers[2];
		
		System.out.println("PreDecrement:Number 3 was changed to " + numbers[2]+" before used");

		numbers[3]--;
		System.out.println("PostDecrement:Number 4 changed to "+ numbers[3]);
		
		
		
		
		//The result is different once the value being used is in the same expression
		//Pre-increment: change it first and then use it
		//Post-increment: use it first and then change it
		
		System.out.println("\n=================PRE  VS POST INCREMENT AND DECREMENT\n========");
		System.out.println("=======SINGLE EXPRESSION==================");
		
		int[] nums = {10,20,30,40};
		
		//PRE-INCREMENT: ++x → Increment first, then use the value.
		System.out.println("Current value"+ nums[0]);
		System.out.println("Preincrement value"+ ++nums[0]); 
		System.out.println("Print the value again "+ nums[0]);
		
		//POST-INCREMENT: x++ → Use the value first, then increment.
		System.out.println("Current value IS "+ nums[1]);
		System.out.println("POSTincrement value IS "+ nums[1]++);   
		System.out.println("Print the value again IS "+ nums[1]);
		
		
		//PRE-DEREMENT:--x → Decrement first, then use the value.
		System.out.println("Current value "+ nums[2]);
		System.out.println("PreDecrement value "+ --nums[2]); 
		System.out.println("Print the value again "+ nums[2]);
		
		//POST-DECREMENT:x-- → Use the value first, then decrement.
		System.out.println("Current value IS "+ nums[3]);
		System.out.println("POSTDecrement value IS "+ nums[3]--);   
		System.out.println("Print the value again IS "+ nums[3]);

	}

}
