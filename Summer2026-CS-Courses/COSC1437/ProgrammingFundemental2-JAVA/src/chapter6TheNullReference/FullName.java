package chapter6TheNullReference;

/*
 * This program stores the Perosn's first, last and middle name. 
 * This class is dangerous because it does not prevent operations on a null reference field
 * */

public class FullName {
	
	private String lastName,
				   firstName,
				   middleName;
	
	
	
	/*The following methods set the last name field*/
	
	
	public void setLastName(String str) 
	{
		lastName = str;
	}
	
	/*The following methods set the first name field*/
	public void setFirstName(String str) 
	{
		firstName = str;
	}
	
	/*The following methods set the middle name field*/
	public void setMiddleName(String str) 
	{
		middleName = str;
	}
	
	
	/*The following methods return the length of the full name*/
	
	public int getLength() 
	{
		return lastName.length() + firstName.length() + middleName.length();
	}
	
	/*The following methdo return a full name*/
	
	
	public String toString()
	{
		String str = "First name: " + firstName
					 +"\nLast name:" + lastName
					 +"\nMiddle name"+ middleName;
		
		return str;
	}
	
	
	
	

}
