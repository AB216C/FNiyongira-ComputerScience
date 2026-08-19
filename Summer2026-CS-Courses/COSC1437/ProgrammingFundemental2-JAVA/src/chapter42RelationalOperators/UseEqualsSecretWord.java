package chapter42RelationalOperators;

import java.util.Scanner;

public class UseEqualsSecretWord {

	public static void main(String[] args) {
		
		String input;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a secret word");
		
		
		input = keyboard.nextLine();
		
		
		if(input.equalsIgnoreCase("PROSPERO"))   //Notice, whether you type in capital or single letters, as long as you type the same name, the code will convert everYthing into CAPTIAL LETTER
		{
			System.out.println("Congratulation. You know the secret word");

		}
		else
		{
			System.out.println("Please try a differnt name");

		}
		
		
		
	}

}
//For  comparison purpose, each input is converted into Captial letters to match PROSPERO