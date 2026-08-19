package chapter5SpeedometerPracticeChapter5;

/*
 The Speed converter class converts speeds in KPH(kilometer per hour) to MPH(mile per hour)
 */

public class SpeedConverter {
	
	final double CONVERSION_FACTOR=0.6214;
	
	
	//GET METHODS WILL ACCEPT SPEED IN KPH AND CONVERT RETURN THE RESULT CONVERTED INTO MPH
	
	public double getMPH(double KPH) 
	{
		return KPH * CONVERSION_FACTOR;
	}

}
