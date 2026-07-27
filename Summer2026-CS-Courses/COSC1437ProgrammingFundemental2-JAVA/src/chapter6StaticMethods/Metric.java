package chapter6StaticMethods;

public class Metric {
	
	
	   /**
	     * The milesToKilometers method converts miles
	   * to kilometers. A distance in miles should be
	   * passed into the miles parameter. The method
	 * returns the equivalent distance in kilometers.
	*/
	
	

	public static double mileToKilometer( double miles) 
	{
		return 1.609 * miles;
	}
	
	
	
	
    /**
	20      * The kilometersToMiles method converts kilometers
	21      * to miles. A distance in kilometers should be
	22      * passed into the kilometers parameter. The method
	23      * returns the equivalent distance in miles.
	24      */
	
	
	
	public static double kilometerToMile (double kilometer) 
	{
		return kilometer/1.609;
	}

}
