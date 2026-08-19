package chapter8MultipleDelimiters;

import java.util.StringTokenizer;

public class MultipleCharacterAsDelimiter {

	public static void main(String[] args) {

		StringTokenizer strTokenizer = new StringTokenizer("joe@gaddisbooks.com", "@.");
		
			while (strTokenizer.hasMoreTokens())
			{
			  System.out.println(strTokenizer.nextToken());
			}

		
	}

}
