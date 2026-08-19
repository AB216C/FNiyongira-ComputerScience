package chapter6OverloadedMethodsDiffNumberOfParameters;

/*This class show the calculations of weekly pay using similar 
 * methods but different number of Parameters*/

public class Pay {
	
	public static double weeklyPay(int hours, double payRate) 
	{
		return hours * payRate;
	}
	
	
	public static double weeklyPay(double yearlySalary) 
	{
		return yearlySalary/52;
	}

}
