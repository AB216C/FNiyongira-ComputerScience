package chapter18Recursive;

public class RecursivePalindrome1UsingSubstring {
	
	
	public static boolean isPalindrome(String s) 
	{
		//Base case 1: Empty string or one character
		if(s.length()<=1) 
		{
			return true;
		}
		
		// Base case 2: First and last characters do not match
		
		else if(!s.substring(0,1).equals(s.substring(s.length()-1))) 
		{
			return false;
		}
		

	    // Recursive case:
	    // Ignore the first and last characters, then check
	    // whether the remaining substring is a palindrome.	
		
		else 
		{
			return isPalindrome(s.substring(1,s.length()-1));
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
		System.out.println("Is noon a palindrome? " + isPalindrome("noon"));
		
		System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
		System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
		System.out.println("Is a a palindrome? " + isPalindrome("a"));
		
	}

}
