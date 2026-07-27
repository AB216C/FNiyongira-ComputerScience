package chapter5;



public class NestedLoopsPatterns {

	public static void main(String[] args) {
		
		//USING CONSTANT TO DETERMINE TOTAL NUMBER OF A STAR IN A COLUMN
		final int COLS = 6;
		
		
		
		for (int col = 0; col< COLS; col++) 
		{
			System.out.println("*");

		}
		
	
		//PLACING LOOP INSIDE ANOTHER LOOP
		
		
		final int ROWS = 8;
		
		
		for (int row = 0; row<ROWS; row++) 
		{
			
			for (int col = 0; col < COLS; col++) 
			{
				System.out.print("Column"+ col + "*");  //The inner loop get printed first
				System.out.print("*");      //Notice print having print vs println make the output look different
			}
			
		System.out.println("Row" + row);   //Notice the outer loop get printed last always
		System.out.println("");

			
		}	
		
	}

}
