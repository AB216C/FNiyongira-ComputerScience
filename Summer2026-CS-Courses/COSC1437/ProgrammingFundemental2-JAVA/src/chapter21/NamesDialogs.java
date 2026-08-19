package chapter21;

import javax.swing.JOptionPane;

// Attention: To be able to use this class, make sure module-info.java at the bottom of source files is able to access java.destop


/**
 
*This demonstrates using of dialogs
*With JOptionPane

*/

public class NamesDialogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName, lastName;
		
		// Get the user's first name
		
		firstName = JOptionPane.showInputDialog("Enter your first Name: ");
		
		
		// Get the user's second name
		
		lastName = JOptionPane.showInputDialog("Enter your last name: ");
		
		
		// Display  a greeting
		
		
		JOptionPane.showMessageDialog(null, "Hello" + firstName  + " " + lastName);
		
		
		System.exit(0);                  //The last method is main method
		

	}

}
