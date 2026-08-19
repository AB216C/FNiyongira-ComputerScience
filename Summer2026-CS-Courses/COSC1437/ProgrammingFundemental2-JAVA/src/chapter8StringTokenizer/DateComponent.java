package chapter8StringTokenizer;

import java.util.StringTokenizer;


 /**
  * The DateComponent class extracts the month, day, and
  * year from a string containing a date.
  */

public class DateComponent {
	
	private String month,      //To hold a month
					day,		//To hold a day
					year;		//To hold year
	
	
   /**
    * The constructor accepts a string containing a date
    * in the form MONTH/DAY/YEAR. It extracts the month,
    * day, and year from the string.
    */
	
	
	public DateComponent(String dateStr) 
	{
		
	   // Create a StringTokenizer object. The string to
	    // tokenize is dateStr, and "/" is the delimiter.
		
		StringTokenizer strTokenizer = new StringTokenizer(dateStr, "/");
		
		//Get the first token which is month
		
		month = strTokenizer.nextToken();
		
		//Get the second token which is day
		
		day = strTokenizer.nextToken();
		
		
		//Get the 3rd token which is year
		
		year = strTokenizer.nextToken();
		
		
	}
	
	   /**
	   * The getMonth method returns the month field.
	   */
	
	public String getMonth() 
	{
		return month;
	}
	
	public String getDay()
	{
		return day;
	}
	
	
	public String getYear()
	{
		return year;
	}
	

}


