package chapter70Arrays;

public class Array1ArrayInitialization {

	public static void main(String[] args) {
		
		
		
		final int MONTHS = 12;
		
		
		//Create and initialize an array
		
		
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};       //Total days containing in a month
		
		
		
		for (int index=0; index < MONTHS; index++) 
		{
			System.out.println("Month " + (index+1) +
					" has "+ days[index] + " days");
		}
	
		

	}

}
