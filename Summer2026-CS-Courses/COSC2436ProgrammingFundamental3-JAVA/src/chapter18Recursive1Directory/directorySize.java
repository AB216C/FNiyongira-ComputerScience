package chapter18Recursive1Directory;
import java.io.*;
import java.util.Scanner;


//Notice using recursion to calculate the directory size is more efficient that using a loop

public class directorySize {
	
	public static long getSize(File file) 
	{
		long size = 0;			//Hold the total size of all files
		
		if(file.isDirectory()) 
		{
			File[] files = file.listFiles();		//All files and subdirectories
			for (int i =0; files !=null && i < files.length; i++) 
			{
				size += getSize(files[i]);		//Recursive call
			}
		}
		else
		{
			//Base case
			size +=file.length();
		}
		
		return size;
	}

	public static void main(String[] args) {
		
		
		//prompt the user to enter the direectory of a file 
		
		System.out.print("Enter a file or a directory name: ");
		
		Scanner input = new Scanner(System.in);
		
		String directory = input.nextLine();
		
		File file = new File(directory);
		
		System.out.println("Exists:" + file.exists());
		System.out.println("Directory:" + file.isDirectory());
		System.out.println("Absolute path:" + file.getAbsolutePath());
		
		//Display the size
		
		System.out.println(getSize(new File(directory)) + "bytes");
	}

}
