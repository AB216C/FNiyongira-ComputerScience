package chapter6DefaultPassObjectsAsArgumentGameRehearse;

import java.util.Random;

//This is a player class for a game CHO-HAN

public class Player {
	
	private String name;      //The player's name
	private String guess;       //The player's quess
	private int points;        //The player's points
	
	//Constructor
	//Accept player's name as an argument
	
	public Player (String playerName) 
	{
		name = playerName;
		guess = "";
		points = 0;
	}
	/*
	 * The make guess method causes the players to guess either Cho(even) or Han(odd)
	 * */
	
	
	public void makeGuess() 
	{
		//Create a random object
		
		Random rand = new Random();
		
		//Get a random number, either o or 1
		
		int guessNumber = rand.nextInt(2);
		
		
		
		//Convert a random number into a guess 
		//of either Cho(even) or Han(odd)
		
		
		if(guessNumber == 0)
			
			guess = "Cho(even)";
	
		else
			guess = "Han(odd)";
	
	}
	
	/*
	 * The addPoints method add a specified number of points to the player's current balance. 
	 * The number of points is passed as an argument
	 * */
	
	
	public void addPoints(int newPoints) 
	{
		points += newPoints;
	}
	
	/*
	 *The getName method returns the player's name 
	 **/
	
	public String getName() 
	{
		return name;
	}
	
	/*
	 *The getGuess method returns the player's guess 
	 */
	
	public String getGuess() 
	{
		return guess;
	}
	
	
	//The getPoints method returns the player's points
	
	public int getPoints() 
	{
		return points;
	}

}
