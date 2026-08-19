package chapter8MultipleDelimiters;

public class StringClassSplitMethod {

	public static void main(String[] args) {
		
		//Create a string to tokenize
		
		
		String str = "One Two Three Four";
		
		
		//Get the token from the string
		//the split method use a whitespace character as  a delimiter
		
		String[] tokens = str.split(" ");
		
		//Display each token
		
		for (String s:tokens) 
		{
			System.out.println(s);
		}
		
		
		//You can also Use an entire world as a delimiter in a split method as shown below
		
		
		String str2 = "One and Two and Three and Four";
				
		String[] tokens2 = str2.split(" and ");
				
		for (String string:tokens2) 
		{
			System.out.println(string);
		}
		
		
		//Next axample, where i use a colon 
		
		
		String myString = "Strawberry,Banana,Apple";
		
		String[] fruits = myString.split(",");
		
		for (String fruit:fruits) 
		{
			System.out.println(fruit);
		}
		
		
		
		//Having multiple delimiters
		
		String myEmail = "joe@gaddisbooks.com";
		
		String[] emailParts = myEmail.split("[@.]");
		
		for (String part:emailParts) 
		{
			System.out.println(part);
		}
		
		
	}

}
