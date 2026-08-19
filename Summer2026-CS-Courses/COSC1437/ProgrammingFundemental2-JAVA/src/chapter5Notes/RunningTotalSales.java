package chapter5Notes;

import java.util.Scanner;
/*
 calculates a company’s total sales over a period of time by taking daily sales
 amounts as input and calculating a running total of them as they are gathered.
 * */

public class RunningTotalSales {

	public static void main(String[] args) {
		
		
	Scanner keyboard = new Scanner(System.in);
	
	
	double totalSales;
	
	int days;
	
	double salesPerDay;
	
	
	System.out.println("Enter number of days you have your sales to be analyzed: ");
	
	days = keyboard.nextInt();
	
	totalSales = 0;
	
	
	
	for (int count = 1; count <= days; count++) 
	{
		System.out.println("Enter sales for day"+ count + " $: ");
		salesPerDay = keyboard.nextDouble(); 
		totalSales += salesPerDay;
	}
	
	System.out.printf("The company's total dales is $%.2f",totalSales);
	
	}

}
