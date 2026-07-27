package chapter21;


import javax.swing.JOptionPane;

import java.util.Scanner;

public class OutputFormatFormatString {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		double monthlyPay = 5000.0;
		double annualPay = monthlyPay * 12;
		
		
		JOptionPane.showMessageDialog(null,String.format("Your annual pay is %.2f", annualPay));
		
		
		//Next example:
		
		
		String name1;
		
		int age;
		
		System.out.print("What is your name? ");
		
		name1 = keyboard.nextLine();
		
		
		System.out.print("What is your age? ");
		
		age = keyboard.nextInt();
		
		
		String finalFormatted;
		
		finalFormatted = String.format("His name is %-8s and he is %d years old",name1, age);
		
		System.out.println(finalFormatted);
		
	}

}
