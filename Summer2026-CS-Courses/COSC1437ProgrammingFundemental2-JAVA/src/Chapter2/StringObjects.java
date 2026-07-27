package Chapter2;

public class StringObjects {

	public static void main(String[] args) {

		String greeting = "Good morning ";
		String name = "Herman";
		
		System.out.println(greeting + name);
		
		
		//Since a String is a class, it has various methods to work with strings
		
		// METHOD 1: LENGTH();
		
		
		int stringSize;
		
		
		stringSize = name.length();
		
		System.out.println("Herman's name has " + stringSize  + " characters.");
		
		//METHOD 2: charAt();
		
		char letter;
		
		String myName;
		
		myName = "Peter Kagabo";
		
		letter = myName.charAt(0);
		
		System.out.println(letter);
		
		
		
		// Method 3: toLowerCase();
		
		String myHero;
		String myHeroConverted;
		myHero = "DATA AND MAMA WANJYE";
		
		System.out.println(myHero);

		
		myHeroConverted = myHero.toLowerCase();
		System.out.println(myHeroConverted);
		
		//Another example
		
		String littleName = "herman";
		String bigName = littleName.toUpperCase();
		System.out.println("This is a big name: " + bigName);
		
		//The reverse of this
		
		String bigName2 = "HERMAN";
		String littleName2 = bigName2.toLowerCase();
		
		System.out.println("This is a little name: " + littleName);

		
		


		
		
		
		
		
		
	}

}
