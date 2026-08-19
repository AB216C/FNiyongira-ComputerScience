package chapter21;

public class ContributionPercentages {

	public static void main(String[] args) {
		
		// if you earn $6000 per month, What is the amount of pay that will go to your retirement plan if you contribute 5%, 8% or 10% of your gross wages.
		
		//SOLUTION
		
		// Variable to hold monthly pay and 
		// contribution
		
		double monthlyPay = 6000.0;
		double contribution;
		
		//Calculate and display a 5% contribution
		
		contribution = monthlyPay * 0.05;
		
		System.out.println("The 5 percent is $"+contribution+" per month");		
		
		//Calculate and display a 8% contribution
		
		contribution = monthlyPay * 0.08;
		
		System.out.println("The 8 percent is $"+contribution+" per month");		
		
		
		//Calculate and display a 10% contribution
		
		contribution = monthlyPay * 0.1;
		
		System.out.println("The 10 percent is $"+contribution+" per month");
		
		
		// CALCULATING A PERCENTAGE DISCOUNT
		
		// The retail regular price is $59 and there is a sale of 20% discount. Calculate the sale of the price item
		
		//Variable that hold regular price 
		// Variable that hold discount
		// Variable that hold the sale price
		
		double regularPrice = 59;
		double discount = 0.2;
		
		double salePrice;
		
		salePrice = 59-(59*0.2);
		
		
		System.out.println("The amount to pay after discount is $"+ salePrice);
		
	}

}
