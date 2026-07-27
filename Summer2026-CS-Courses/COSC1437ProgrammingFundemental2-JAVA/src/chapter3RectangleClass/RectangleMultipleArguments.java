package chapter3RectangleClass;



import java.util.Scanner;


class Rectangle2 {
	
	private double boxLength;
	private double boxWidth;
	
	public void set(double ln, double w) {
		boxLength = ln;
		boxWidth = w;
	}
	
	public double getLength() {
		return boxLength;
	}
	
	public double getWidth() {
		return boxWidth;
	}
	
	
	public double getArea() {
		return boxLength * boxWidth;
	}
	
}


public class RectangleMultipleArguments {

	public static void main(String[] args) {
		
		
		double boxLength,            //Hold box length
		         boxWidth;            // Hold box width
		
		//Create a Scanner Object for a keyboard in put
		
		Scanner keyboard = new Scanner(System.in);
		
		//Create a rectangle object
		
		Rectangle2 box = new Rectangle2();
		
		
		// Get the box's length: 
		
		System.out.print("What is the box's length? ");
		
		boxLength = keyboard.nextDouble();
		
		// get the box's width
		
		System.out.print("What is the box's width? ");
		
		boxWidth = keyboard.nextDouble();
		
		// Pass box width and box length to the same method
		
		
		box.set(boxLength, boxWidth);
		
		
		// DISPLAY BOX LENGTH, WIDTH AND AREA
		
		System.out.println("The box's length is " + box.getLength() + "meters");
		System.out.println("The box's width is " + box.getWidth() + "meters");
		System.out.println("The box's length is " + box.getArea() + "square meters");
		
		

		
		

	}
	

}
