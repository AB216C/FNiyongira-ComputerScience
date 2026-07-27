package chapter8StringTokenizer;

public class DataTester {

	public static void main(String[] args) {
		
		//Create a string containing a date
		
		String date = "10/23/2028";
		
		//Create a date component and initialize it with the date
		
		DateComponent dc = new DateComponent(date);
		
		//Display the components of the date
		
		System.out.println("Here is a date: " + date);
		
		System.out.println("The month is " + dc.getMonth());
		
		System.out.println("The day is " + dc.getDay());
		
		System.out.println("The year is " + dc.getYear());		
		
		
	}

}
