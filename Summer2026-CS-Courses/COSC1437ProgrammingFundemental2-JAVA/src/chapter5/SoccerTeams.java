package chapter5;

import java.util.Scanner;

/*
 calculates the number of soccer teams a youth league may create, based on a given number of players and a maximum number of players per team. 
 The program uses while loops to validate all of the user input. 
 */

/*
 This program calculate the number of soccer teams
 That a youth league may create from the number of available players
 input validation is demonstrated with while loop
 
 * */
public class SoccerTeams {

	public static void main(String[] args) {
		
		final int MIN_PLAYERS = 9,         //Minimum players per team
			       MAX_PLAYERS=15;			//Maximum players per team
		
		int players,			//Number of available players
			teamSize,			//Number of player per team
			teams,				//Number of teams
			leftOvers;			//Number of left over players
		
		
		//Create a scanner object for keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		// Get the number of player per team
		
		System.out.print("Enter number of players per team:");
		teamSize = keyboard.nextInt();
		
		//Validate the input
		
		
		while (teamSize < 9 || teamSize > 15) {
			
			System.out.print("Team size should be at least " + MIN_PLAYERS 
					+ " but not above " + MAX_PLAYERS);
			teamSize = keyboard.nextInt();
		}
		
		//Get the available number of players

		System.out.print("Enter available number of players: ");
		players = keyboard.nextInt();
		
		// VALIDATE PLAYERS
		
		while (players < 0) 
		{
			System.out.println("Please do not enter negative");
			System.out.print("Enter available number of players: ");
			players = keyboard.nextInt();
			
		}
		
		
		//Calculate number of teams
		
		teams = players / teamSize;
		
		//Calculate the number of leftover players
		
		leftOvers = players%teamSize;
		
		
		System.out.println("There will be " + teams + " teams" + 
							" with " + players + " players and " + leftOvers + " left overs");
		
		
	}

}
