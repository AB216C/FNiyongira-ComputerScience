package chapter18Recursive2TowerOfHanoi;

//Tower of Hanoi is also inherently recursive. it is not easy to solve using iteration

import java.util.Scanner;


public class TowerOfHanoi {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter number of disks:");
		
		int n = input.nextInt();
		
		
		//Find the solution recursively
		
		System.out.println("The moves are:");
		
		moveDisks(n, 'A', 'B', 'C');
		
	}
	
	
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) 
	{
		if(n==1)													//Stopping condition
			System.out.println("Move disk " + n + " from " 
								+ fromTower + "to" + toTower);		//Base case
		
		else
		{
			moveDisks(n-1, fromTower, auxTower, toTower);			//Recursion
			System.out.println("Move disk " + n + " from " 
					+ fromTower + " to " + toTower);
			moveDisks(n-1, auxTower, toTower, fromTower);
		}
	}
	

}
