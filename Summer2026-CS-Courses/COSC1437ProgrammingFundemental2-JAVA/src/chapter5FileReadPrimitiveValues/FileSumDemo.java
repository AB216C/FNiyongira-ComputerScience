package chapter5FileReadPrimitiveValues;

import java.io.*;

/*
 * This program demonstrate the file sum class
 * **/
public class FileSumDemo {

	public static void main(String[] args) throws IOException {

		//Create instance of the file sum class
		
		FileSum fs = new FileSum("src/chapter5FileReadPrimitiveValues/Number.txt");
		
		
		//Display sum of values in Number.txt
		
		System.out.println("The sum of numbers in Numbers.txt is " + fs.getSum());
	}

}
