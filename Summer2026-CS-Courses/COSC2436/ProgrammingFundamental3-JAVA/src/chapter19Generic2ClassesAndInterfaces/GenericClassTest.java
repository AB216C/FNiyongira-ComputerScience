package chapter19Generic2ClassesAndInterfaces;

public class GenericClassTest {

	public static void main(String[] args) {
		

		//Testing Generic stack of strings
		
		GenericStack<String> stack1 = new GenericStack<>();
		
		stack1.push("Dallas");
		stack1.push("NewYork");
		stack1.push("Paris");
		
		
		
		stack1.push("Kigali");
		
		
		for (int i=0; i<stack1.getSize(); i++) 
		{
			System.out.println(stack1.get(i) + "");
		}
		
		//Testing generic stack of integers
		
		GenericStack<Integer> stack2 = new GenericStack<>();
		
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		
		
		stack2.pop();		//Remove the last number
		
		
		
		for (int index=0; index<stack2.getSize(); index++) 
		{
			System.out.println(stack2.get(index) + " ");
			
		}
		
		
		System.out.println(stack1.isEmpty());
		System.out.println(stack2.isEmpty());
		
	
		
		
	}

}
