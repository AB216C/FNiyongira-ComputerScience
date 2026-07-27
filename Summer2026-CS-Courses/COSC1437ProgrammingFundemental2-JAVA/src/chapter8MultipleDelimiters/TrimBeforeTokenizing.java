package chapter8MultipleDelimiters;

import java.util.StringTokenizer;

public class TrimBeforeTokenizing {

	public static void main(String[] args) {
		
		// Create a string with leading and trailing whitespaces.
		String str = "  one;two;three  ";
		// Tokenize the string using the semicolon as a delimiter.
		StringTokenizer strTokenizer = new StringTokenizer(str, ";");
		// Display the tokens.
		while (strTokenizer.hasMoreTokens())
		{
		  System.out.println("*" + strTokenizer.nextToken() + "*");
		}
		
		
		
		//USING TIM TO REMOVE LEADING AND TRALING SPACE
		
		StringTokenizer strTokenizer2 = new StringTokenizer(str.trim(), ";");
		
		while (strTokenizer2.hasMoreTokens())
		{
			System.out.println("*" + strTokenizer2.nextToken()+"*");
		}
	}

}
