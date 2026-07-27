package chapter6OverloadConstructors;

public class RectanglesDemo {

	public static void main(String[] args) {
		
		//Create two Rectangle objects
		
		Rectangle box1, box2, box3;
		
		
		box1 = new Rectangle();
		
		
		
		System.out.println("Rectangle1 length is " + box1.getLength() + " and the width is " + box1.getWidth());
		
		
		
		box2 = new Rectangle(4.0, 4.5);
		
		System.out.println("Rectangle1 length is " + box2.getLength() + " and the width is " + box2.getWidth());
		
		
		box3 = new Rectangle(20.0, 40.5);
		
		System.out.println("Rectangle1 length is " + box3.getLength() + " and the width is " + box3.getWidth());

	
		
	}

}
