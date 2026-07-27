package chapter4RelationalOperators;


//This program simulate the rolling dice


public class SimulateDiceDemo {

	public static void main(String[] args) {
		
		final int DIE1_SIDES = 6;       //Number of sides for die #1 
		final int DIE2_SIDES = 12;		
		
		
		// CREATE TWO INSTANCES FOR A DIE CLASS
		
		SimulateDice  die1 = new SimulateDice(DIE1_SIDES);
		SimulateDice die2 = new SimulateDice(DIE2_SIDES);
		
		
		//Display initial information
		
		System.out.println("This simulate a rolling of a " + DIE1_SIDES + 
				"-sided die and a "+ DIE2_SIDES + "-sided die.");
		
		
		//Roll the dice
		
		System.out.println("Roll the dice");
		
		die1.roll();
		die2.roll();
		
		//Display the value of the die
		
		System.out.println(die1.getValue()+ " " + die2.getValue());
	}

}
