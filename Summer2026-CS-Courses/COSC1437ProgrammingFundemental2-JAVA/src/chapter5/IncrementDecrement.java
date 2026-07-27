package chapter5;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//Postfix 
		//Return the value and then change it
		
		
		int number = 5;
		int number1;
		
		number1 = number ++;
		
		
		System.out.println("The number after increment:" + number);
		System.out.println("The original number:" + number1);

		
		
		//-------------MEANING OF POST FIX CODE------------------		
		      //     number9 = number 10;
		      //     number 10 = number 10 -1;
		
		int number10 = 40;
		int number9;
		
		number9 = number10 --;
		
		
		System.out.println("After decrement" + number10);
		System.out.println("Original number" + number9);

		
		// Prefix method
		
		// Change the value and then return it
		
		//DECREMENT
		int num = 8;
		int num2;
		
		num2 = -- num;
		
		System.out.println("Num after decrement decrement:" + num);
		System.out.println("Original number:" + num2);

		//INCREMENT

		
	    int num4 = 100;
	    int num5;
	    
	    num5 = ++num4;
	    
		//-------------MEANING OF PRE FIX  CODE------------------	
	
	    // same as : num4 = num4 + 1;
	    // 			 num5 = num4;
	    		
		System.out.println(" Number after increment:" + num4);
		System.out.println(" Original number:" + num5);
		
	}

}
