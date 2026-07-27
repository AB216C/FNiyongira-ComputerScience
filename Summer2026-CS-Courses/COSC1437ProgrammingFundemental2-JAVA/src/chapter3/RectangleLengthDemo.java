package chapter3;

/*
 * 
 * Rectangle class phase 1, under construction

*/

class Rectangle {                              //Not adding public in front of this class make it private because only one public class is allowed per java file
	
	private double length;
	private double width;
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle (double length, double width) {    // This is an argument constructor constructure
		
		this.length = length;
		this.width = width;
		
	}
	
	
	public void setLength(double len) {
		length = len;
		
	}
	
	public void setWidth(double w) {
		width=w;
	}
	
	//Creating methods to return values stored in length field and width field
	
	public double getLength() {
	return length;	
	}
	
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return length * width;
	}
	
}


public class RectangleLengthDemo {

	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(1,5);            //Here the Object of reactable class is created and initialized with twoarguments
		
		System.out.print("Sending the value 10 and 23 to the setLength and setWidth methods");
		
		box.setLength(10);        //Not commenting this code will change initial value of 1 from constructor
		box.setWidth(23);          //Not commenting this code will change the initial value of 5 from constructor
		
		System.out.println("Done");
		
		//After creating two getter methods, now length and width can be returned
		
		System.out.print("The rectangle's length is " + box.getLength() + " meters\n");
		System.out.print("The rectangle has a width of " + box.getWidth() + " meters\n");
		
		// After creating a get area methods, now the area can be returned
		
		System.out.print("The rectangle's area " + box.getArea() + " meter square\n");
		
		
	}

}


/*
 1. Benefit of the no-argument constructor

It lets you create an object first and fill in the values later.

Rectangle kitchen = new Rectangle();

kitchen.setLength(12);
kitchen.setWidth(10);

This is useful when:

You don't know the values yet.
You will ask the user for input later.
You want an "empty" object with default values.

Your RoomAreas program is a perfect example.

2. Benefit of the constructor with arguments

It lets you create and initialize the object in one step.

Rectangle box = new Rectangle(12, 10);

Instead of:

Rectangle box = new Rectangle();
box.setLength(12);
box.setWidth(10);

This is useful when:

You already know the values.
You want to ensure the object starts with meaningful data.
You want shorter, cleaner code.

Your RectangleLengthDemo is an example of this style.

3. Having both gives you choices

You can use whichever style fits the situation.

User input situation
Rectangle room = new Rectangle();

room.setLength(keyboard.nextDouble());
room.setWidth(keyboard.nextDouble());
Known values situation
Rectangle tile = new Rectangle(2, 2);
 */




