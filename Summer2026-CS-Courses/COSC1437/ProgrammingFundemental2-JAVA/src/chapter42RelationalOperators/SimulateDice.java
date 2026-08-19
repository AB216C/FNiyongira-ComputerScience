package chapter42RelationalOperators;

/*
 Write a program that needs to roll simulated dice with various number of sides. 
*/
//The die class simulate a die with a specified number of sides

import java.util.Random;


public class SimulateDice {
	
	private int sides;    //Number of sides
	private int value;    //Die's value
	
	
	/*
	 Constructors perform initial roll of die. 
	 The number of sides of a die is passed as an argument
	 */
	
	
	public SimulateDice(int numSides) 
	{
		sides = numSides;
		roll();	
	}
	
	
	/*
	 The roll method simulate the rolling of the die
	 
	 */
	
	public void roll()
	{
		//Create a random objects
		
		Random rand = new Random();
		
		value = rand.nextInt(sides)+1;
	}
	
	/*
	 * The getSides methods return sides for the die
	 * */
	
	public int getSides() 
	{
		return sides;
	}
	
	/*
	 * The getValue methods return value for the die
	 * */
	
	public int getValue() 
	{
		return value;
	}

}
