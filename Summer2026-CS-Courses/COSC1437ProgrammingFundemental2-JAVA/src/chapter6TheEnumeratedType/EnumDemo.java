package chapter6TheEnumeratedType;

/*This program demonstrate enumerated type*/

public class EnumDemo {
	
	//Declare the Day enumerated type
	
	enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

	public static void main(String[] args) {
		
		
		//Declare a day varible and assign it a value
		
		Day workDay = Day.WEDNESDAY;
		
		//The following statement display wednesday
		
		System.out.println(workDay);
		
		
		//The following statement display the ordinal
		//The value for Day.SUNDAY IS 0
		
		System.out.println("The ordinal value for " 
							+ Day.SUNDAY + 
							" is " 
							+ Day.SUNDAY.ordinal());
		
		
		//The following statement display the ordinal
		//The value for Day.SATURDAY which is  6
		
		System.out.println("The ordinal value for " 
				+ Day.SATURDAY + 
				" is " 
				+ Day.SATURDAY.ordinal());		
		
		//The following statements compares the two enum statments
		
		
		if(Day.FRIDAY.compareTo(Day.MONDAY)>0) 
		{
			System.out.println(Day.FRIDAY + " is greater than " + Day.MONDAY);
		}
		else
			System.out.println(Day.FRIDAY + "is not greater than " + Day.MONDAY);
			
	

	}

}
