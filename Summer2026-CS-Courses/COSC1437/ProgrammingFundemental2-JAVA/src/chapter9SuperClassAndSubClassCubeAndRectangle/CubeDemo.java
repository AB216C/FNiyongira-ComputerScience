package chapter9SuperClassAndSubClassCubeAndRectangle;

import java.util.Scanner;


 /**
  * This program demonstrates passing arguments to a
  * superclass constructor.
  */

public class CubeDemo {

	public static void main(String[] args) {
		
		double length,			//Hold length
				width,			//Hold width
				height;			//Hold height
		
		
		//Create a scanner object 
		
		Scanner keyboard = new Scanner(System.in);
		
		//Get the dimensions of a cube from the user
		
		
		System.out.println("Enter the following dimensions");
		
		System.out.println("Enter length:" );
		length = keyboard.nextDouble();
		
		System.out.println("Enter width: ");
		width = keyboard.nextDouble();
		
		System.out.println("Enter height: ");
		height = keyboard.nextDouble();
		
		
		//Create a Cube objects and pass dimensions to initiate constructors
		
		Cube myCube = new Cube(length, width, height);
		
		
		   // Display the properties of the cube.
		
		System.out.println("Here are the properties of the cube");
		
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
		System.out.println("Height: " + height);
		
		System.out.println("BaseArea: " + myCube.getArea());
		System.out.println("Surface Area: " + myCube.getSurfaceArea());
		System.out.println("Volume: " + myCube.getVolume());
		
		
	}

}
