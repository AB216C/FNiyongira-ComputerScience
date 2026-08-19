package chapter18Recursive;

public class RecursivePalindrome2AddHelperMethod {
	
	
	public static boolean isPalindrome(String s) 
	{
		return isPalindrome(s, 0, s.length() - 1);
	}

	
	public static boolean isPalindrome(String s, int low, int high) 
	{
		//Base case 1: Empty string or one character
		if(high <= low) 	//Base case --> This is focusing on the movement inward (low index increases as high index decreases)
		{
			return true;
		}
		
		// Base case 2: First and last characters do not match
		
		else if(s.charAt(low) != s.charAt(high))  //base case
		{
			return false;
		}
		
		
		else 
		{
			return isPalindrome(s, low + 1, high-1);
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
