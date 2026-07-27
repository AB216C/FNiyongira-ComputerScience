package chapter6TheEnumeratedOwnFiles;

public class SportsCarDemo2Switching {

	public static void main(String[] args) {
		
		
		/*This program shows that you can switch on enumerated types*/
		
		//create a sport car object
		
		SportsCar yourNewCar = new SportsCar(CarType.PORCHE, CarColor.BLACK, 200000);
		
		
		//Get the car make and switch on it
		
		
		switch(yourNewCar.getMake()) 
		{
		case PORCHE : 
			System.out.println("Your car was made in German");
			break;
			
		case FERRARI : 
			System.out.println("Your car was made in Italy");
			break;
			
		case JAGUAR : 
			System.out.println("Your car was made in England");
			break;
			
		default : 
			System.out.println("I'm not sure where this car was made from");
			break;
		}


	}

}
