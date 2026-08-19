package chapter5SpeedometerPracticeChapter5;

/*
 
In the Spotlight: Designing a Count-Controlled for Loop 
Your friend Amanda just inherited a European sports car from her uncle. 
Amanda lives in the United States, and she is afraid she will get a speeding ticket because the car’s speedometer indicates kilometers per hour. 
She has asked you to write a program that displays a table of speeds in kilometers per hour with their values converted to miles per hour. 
The formula for converting kilometers per hour (KPH) to miles per hour (MPH) is

MPH = KPH * 0.6214

The table that your program displays should show speeds from 60 kilometers per hour through 130 kilometers per hour, 
in increments of 10, along with their values converted to miles per hour. 
The table should look something like this:
  
 */


//THIS PROGRAM SHOWS THE A TABLE OF SPEEDS CONVERTED FROM KPH TO MPH

public class SpeedTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CONSTANTS
		
		final int STARTING_KPH = 60;	//Initial speed
		final int MAX_KPH = 130;         //maximum speed
		final int INCREMENT = 10;       //speed increment
		
		
		//Variables
		
		int kph;             //Hold the speed in kPH
		double mph;			// Hold the speed in MPH
		
		//Create the instance of speed converter class
		
		SpeedConverter converter = new SpeedConverter();
		
		//DISPLAY TABLE HEADINGS
		
		System.out.println("KPH\t\tMPH");
		System.out.println("--------------------");
		
		//DISPLAY THE SPEEDS
		
		for (kph = STARTING_KPH; kph<= MAX_KPH; kph +=INCREMENT) 
		{
			//Get the mph
			
			mph = converter.getMPH(kph);
			
			//Display speed in KPH and MPH
			
			System.out.printf("%d\t\t%.1f\n", kph, mph);
			
		}
		
		
		
		
		
		
		

	}

}
