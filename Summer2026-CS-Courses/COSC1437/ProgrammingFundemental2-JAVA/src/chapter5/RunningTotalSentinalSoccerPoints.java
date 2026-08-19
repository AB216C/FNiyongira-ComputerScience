package chapter5;

import java.util.Scanner;


/*
 It calculates the total points earned by a soccer team over a series of games. 
 It allows the user to enter the series of game points, then enter -1 to signal the end of the list.
 * */

public class RunningTotalSentinalSoccerPoints {

	public static void main(String[] args) {
		
		
		int points;
		
		
		int totalPoints;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter points earned by your team for each game");
		System.out.println("Enter -1 when finished");
		
		points = keyboard.nextInt();
		
		totalPoints = 0;
		
		
		while (points != -1) 
		{
			totalPoints += points;
			System.out.println("Enter points earned by your team for each game");
			System.out.println("Enter -1 when finished");
			points = keyboard.nextInt();
		}
		
		
		System.out.println("The total points for the game is " + totalPoints);
		
	}

}
