package chapter77StringArray;

 /**
  * This program demonstrates an array of String objects.
  */

public class MonthDays {

	public static void main(String[] args) {
		

		//Create an array of strings containing the names of the  months
		
		 String[] months = { "January", "February", "March",
				              "April", "May", "June", "July",
				              "August", "September", "October",
				              "November", "December" };
		 
		 
		 //Create an array containing number of days in each month
		 
		     int[] days = { 31, 28, 31, 30, 31, 30, 31,
				            31, 30, 31, 30, 31 };
		     
		     
		    //Display the number of days in each month
		     
		     
		     for (int index = 0; index<months.length; index++) 
		     {
		    	 System.out.println(months[index] + " has " + days[index] + " days");
		     }
		     
		     
		     //Displaying differently
		     
		     System.out.println("=====================Reverse Engineering=======================");
		     
		     for (int index= 0; index<days.length; index++) 
		     {
		    	 System.out.println(months[index]+ " has " + days[index] + " days");
		     }
	}

}
