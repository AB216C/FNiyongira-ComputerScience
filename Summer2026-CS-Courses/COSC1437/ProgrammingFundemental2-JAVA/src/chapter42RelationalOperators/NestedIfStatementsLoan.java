package chapter42RelationalOperators;

import java.util.Scanner;

public class NestedIfStatementsLoan {

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
	
	
	
	if(salaryYearly>=50000) 
		
	{
		if(yearsOnJob >= 2) 
		{
			System.out.print("You are eligible for a loan. Congratulations");
		}
		
		else
			{
			System.out.print("You should have worked 2 years or more to qualify. Please apply again next time");
			}
		
	}
	else
			
		{
		System.out.print("Your pay should be greater than 50k to qualify. Please apply next time");
		}
	
	}

}
