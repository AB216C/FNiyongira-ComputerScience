package chapter24ImplementStack;

public class StackDemo {

	public static void main(String[] args) {
		

		// Create a stack Object
		GenericStack<String> stack = new GenericStack<>();

		// Add elements to the stack
		stack.push("Tom"); // Push Tom to the stack
		System.out.println("(1) " + stack);

		stack.push("Susan"); // Push Susan to the the stack
		System.out.println("(2) " + stack);

		stack.push("Kim"); // Push it to the stack
		stack.push("Michael"); // Push Michael to the stack
		System.out.println("(3) " + stack);

		// Remove elements from the stack
		System.out.println("(4) " + stack.pop());
		System.out.println("(5) " + stack.pop());
		System.out.println("(6) " + stack);
	}

}
