package chapter6DefaultPassObjectsAsArgumentGameRehearse;


//Dealer class for the game of CHO-HAN

public class Dealer {
	
	private int die1Value;
	private int die2Value;
	
	
	
	/*
	 * Constructor
	 **/
	
	
	public Dealer () 
	{
		die1Value = 0;
		die2Value = 0;
	}
	
	
	
	/*
	 * The rollDice method rolls the dice and saves their values
	 * */
	
	
	public void rollDice() 
	{
		final int SIDES = 6;		//Number of sides of the  dice
		
		//Create the two dice. (This also rolls them)
		
		Die die1 = new Die(SIDES);
		Die die2 = new Die(SIDES);
		
		//Record their values
		
		die1Value = die1.getValue();
		die2Value = die2.getValue();
	}
	
	/*
	 * The getChoOrHan method returns the result of the dice Roll. 
	 * If the sum of the dice is even, the method returns "Cho(even)"; 
	 * Otherwise, it returns "Han(odd)"
	 **/
	
	public String getChoOrHan() 
	{
		String result;       //To hold the result
		
		//Get the sum of the dice
		
		int sum = die1Value + die2Value;
		
		
		//Determine even or odd
		
		if(sum%2==0) 
			result = "Cho(Even)";
		
		else
			result = "Han(odd)";
		
	   return result;
	}
	
	
	/*
	 *Get die1Value method of the die1 
	 * */
	
	
	public int getDie1Value() 
	{
		return die1Value;
	}
	
	
	/*
	 *Get die2Value method of the die2
	 * */
	
	
	public int getDie2Value() 
	{
		return die2Value;
	}
	
	

}
