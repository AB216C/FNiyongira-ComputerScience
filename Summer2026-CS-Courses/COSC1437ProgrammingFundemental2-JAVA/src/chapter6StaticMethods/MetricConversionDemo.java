package chapter6StaticMethods;

import java.util.Scanner;

public class MetricConversionDemo {

	public static void main(String[] args) {
		
		double miles;
		double kilos;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter total miles needed for conversion: ");
		miles = keyboard.nextDouble();
		
		//Convert miles to kilometer;
		
		kilos = Metric.mileToKilometer(miles);
		
		System.out.printf("%.2f miles equals to %.2f kilometers \n",miles, kilos);
		
		
		keyboard.nextLine();
		//Conversion into miles
		
		System.out.println("Enter total kilometers needed for conversion: ");
		kilos = keyboard.nextDouble();
		
		//convert kilometers to miles
		
		miles = Metric.kilometerToMile(kilos);
		System.out.printf("%.2f miles equals to %.2f kilometers",kilos,miles);
		
		
	}

}
