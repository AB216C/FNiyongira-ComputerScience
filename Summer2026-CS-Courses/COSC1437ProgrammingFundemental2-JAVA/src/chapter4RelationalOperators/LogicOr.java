package chapter4RelationalOperators;

import java.util.Scanner;

public class LogicOr {

	public static void main(String[] args) {

		double salaryYearly;
		double yearsOnJob;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		//Check if eligible for a loan
		
		System.out.println("To check if eligible for a loan fill the info below: ");
			
		
		
		System.out.println("How long have you been employed? \n");
		
		yearsOnJob = keyboard.nextDouble();
		
		
		System.out.println("How much do you earn per year? \n");
		
		salaryYearly = keyboard.nextDouble();
		
		
		if ((salaryYearly >= 50000) || (yearsOnJob >= 2))
		{
			System.out.println("Qualified for a loan");
			
		}
		else 
		{
			System.out.print("Not qualified for a loan");
			
		}
	
	
	}

}
