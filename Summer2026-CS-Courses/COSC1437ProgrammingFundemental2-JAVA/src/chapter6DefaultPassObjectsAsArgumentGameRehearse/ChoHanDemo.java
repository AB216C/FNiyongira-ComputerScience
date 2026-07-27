package chapter6DefaultPassObjectsAsArgumentGameRehearse;

/*
 Cho–Han is a traditional Japanese gambling game in which a dealer uses a cup to roll two six-sided dice. 
 The cup is placed upside down on a table so that the value of the dice is concealed. 
 Players then wager on whether the sum of the dice values is even (Cho) or odd (Han). 
 The winner, or winners, take all of the wagers, or the house takes them if there are no winners.
We will develop a program that simulates a simplified variation of the game. The simulated game will have a dealer and two players. 
The players will not wager money, but will simply guess whether the sum of the dice values is even (Cho) or odd (Han). 
One point will be awarded to the player, or players, correctly guessing the outcome. 
The game is played for five rounds, and the player with the most points is the grand winner.
In the program, we will use the Die class that was introduced in Chapter 4. 
We will create two instances of the class to represent two six-sided dice. 
In addition to the Die class, we will write the following classes:

Dealer class: We will create an instance of this class to represent the dealer. 
It will have the ability to roll the dice, report the value of the dice, and report whether the total dice value is Cho or Han.
Player class: We will create two instances of this class to represent the players. 
Instances of the Player class can store the player’s name, make a guess between Cho or Han, and be awarded points.

First, let’s look at the Dealer class. Figure 6-5 shows a UML diagram for the class, and Code Listing 6-15 shows the code.

Figure 6-5 UML diagram for the Dealer class

 */

import java.util.Scanner;

public class ChoHanDemo {

	public static void main(String[] args) {
		
		
		final int MAX_ROUNDS = 5;		//Number of rounds
		String player1Name;
		String player2Name;
		
		//Create a scanner object of a keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		//Get the player's name
		
		System.out.println("Enter the first player's name:");
		player1Name = keyboard.nextLine();
		
		
		System.out.println("Enter the second player's name:");
		player2Name = keyboard.nextLine();
		
		
		//Create the dealer object
		
		Dealer dealer = new Dealer();
		
		
		//Create the two players
		
		Player player1 = new Player(player1Name);
		
		Player player2 = new Player(player2Name);
		

		//Play rounds
		
		for (int round = 0; round < MAX_ROUNDS; round++) 
		{
			System.out.println("============================================================");
			System.out.printf("Now playing round %d.\n", round + 1);
			
			//Roll the dice
			
			dealer.rollDice();
			
			//The players make their guesses
			
			player1.makeGuess();
			player2.makeGuess();
			
			//Determine the winner for this round
			
			roundResults(dealer, player1, player2);
			
		}
		
		//Display the grand winner
		
		displayGrandWinner(player1, player2);
		
	}
	
	//Creating new functions to display the winners
	
	/*
	 *roundResults method determine the the results of the current round
	 *The parameters are: dealer: The Dealer object,
	 *  				  player1: Player#1 object, 
	 * 					  player2: Player#2 object
	 */

	public static void roundResults(Dealer dealer, Player player1, Player player2) 
	{
		//Show the dice value
		System.out.printf("The dealer rolled %d and %d\n", dealer.getDie1Value(), dealer.getDie2Value());
		
		System.out.printf("Results: %s\n", dealer.getChoOrHan());
		
		//Check each player's guess and award points
		
		checkGuess(player1, dealer);
		checkGuess(player2, dealer);	
		
	}
	
	/*
	 *The checkGuess method checks a player's guess against the dealer's result. The parameters are 
	 *player: The Player object to check
	 *dealer: The Dealer object.
	 */
	public static void checkGuess(Player player, Dealer dealer) 
	{
		final int POINTS_TO_ADD = 1; 			//Points to award winner
		String guess = player.getGuess();		//Player's guess
		String choHanResult = dealer.getChoOrHan();			//CHO OR HAN
		
		//Display player's guess
		
		System.out.printf("The player %s  guessed %s.\n ",player.getName(), player.getGuess());
		
		
		//Award points if the player guessed correctly
		
		if (guess.equalsIgnoreCase(choHanResult))
		{
			player.addPoints(POINTS_TO_ADD);
			System.out.printf("Awarding %d point(s) to %s.\n",POINTS_TO_ADD, player.getName());
		}
	}

	//================DISPLAY GRAND WINNER METHODS DISPLAYS THE GAME'S GRAND WINNER=================
	
	/*PARAMETERS ARE AS FOLLOWS:
	 * player1: player#1
	 * player2: player#2
	 * 
	 */
	public static void displayGrandWinner(Player player1, Player player2) 
	{
		System.out.println("---------------------------------------------------");
		System.out.println("Game over. Here are the results:");
		
		
		System.out.printf("%s : %d points. \n", player1.getName(), player1.getPoints());
		System.out.printf("%s : %d points. \n", player2.getName(), player2.getPoints());
		
		
		if (player1.getPoints() > player2.getPoints()) 
		{
			System.out.println(player1.getName() + " is the grand winner!");
		}
		else if (player1.getPoints() < player2.getPoints()) 
		{
			System.out.println(player2.getName() + " is the grand winner");
		}
		else
			System.out.println("Both players are tied");
	}

}
