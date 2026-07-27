package chapter6StaticField;

public class StaticFieldDemo {

	public static void main(String[] args) {

		
		//Initialize the variable to record the incremented value
		
		int objectCount;
		
		//Create instances of the class Countable
		
		Countable object1 = new Countable();
		Countable object2 = new Countable();
		Countable object3 = new Countable();
		Countable object4 = new Countable();
		
		
		
		//Get total number of instances from the class's static field
		//Notice all 4 objects 
		
		objectCount = object2.getInstanceCount();     //Notice all these instances share class's static field
		
		System.out.println("Total number of objects created are " + objectCount);
		
		
	}

}
