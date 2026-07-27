
package chapter5;
import java.util.Scanner;

/*
 
A project currently underway at Chemical Labs, Inc. requires that a substance be continually heated in a vat. 
A technician must check the substance’s temperature every 15 minutes.
If the substance’s temperature does not exceed 102.5 degrees Celsius, then the technician does nothing.
 However, if the temperature is greater than 102.5 degrees Celsius, the technician must turn down the vat’s thermostat, wait 5 minutes, and check the temperature again. 
The technician repeats these steps until the temperature does not exceed 102.5 degrees Celsius. 
The director of engineering has asked you to write a program that guides the technician through this process.
Here is the algorithm:

Prompt the user to enter the substance’s temperature.
Repeat the following steps as long as the temperature is greater than 102.5 degrees Celsius:

Tell the technician to turn down the thermostat, wait 5 minutes, and check the temperature again.
Prompt the user to enter the substance’s temperature.
After the loop finishes, tell the technician that the temperature is acceptable and to check it again in 15 minutes.
 
 * */


/*
This program assist a technician to check the temperature of the substance
*/


public class WhileLoopCheckTemperature {

	public static void main(String[] args) {
		
		final double MAX_TEMPERATURE = 102.5;
		
		double substanceTemperature;		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the substance's temperature: ");
		substanceTemperature = keyboard.nextDouble();
		
		
		while(substanceTemperature > MAX_TEMPERATURE) 
		{
			System.out.println("Turn down thermostat");
			System.out.println("Wait 5 minutes");
			System.out.println("Check the substance's temperature again");
			System.out.println("Enter it here: ");

			
			substanceTemperature = keyboard.nextDouble();
		}
		
		System.out.println("Temperature acceptable.");
		System.out.println("Please check it again in 15 minutes");
		
	}

}
