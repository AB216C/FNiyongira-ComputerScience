package chapter20StacksAlgorthm;
import java.util.Stack;
public class EvaluateExpression {

	public static void main(String[] args) {
		
	    if (args.length != 1) {
	        System.out.println("Usage: java EvaluateExpression \"expression\"");
	        System.out.println("No expression entered. Using default expression.\n");

	        args = new String[] { "(1+2)*4-3","234-456", "500/45" };
	    }
	    
	    for (String expression:args) 
	    {
	    	try {
	    		System.out.println(expression + "=" + evaluateExpression(expression));
	    	}
	    	
	    	catch(Exception ex) { 
	    		
	    		System.out.println("Wrong expression:" + expression);
	    		
	    	}
	    }

	    
	}
	
	
	/**Evaluate an expression*/
	
   	public static int evaluateExpression(String expression) 
	{
		//Create OperandStack to store operands
		Stack<Integer> operandStack = new Stack<>();
		
		//Create operatorStack to store operator
		
		Stack<Character> operatorStack = new Stack<>();
		
		
		//Insert blank around (, ), +, -, /, and *
		
		expression = insertBlanks(expression);
		
		//Extract operations and operators
		
		String[] tokens = expression.split(" ");	
		
		//Phase1 : Scan tokens
		
		for (String token:tokens) 
		{
			if(token.length()==0)		//Blank here
				continue;			    //Back to the while loop to extract tokens
			else if (token.charAt(0)== '+'|| token.charAt(0) == '-')
			{
				//Process all +, -, *, / in the top of operator stack
				
				while(!operatorStack.isEmpty() && 
							(operatorStack.peek() == '+' || 
							operatorStack.peek() == '-' ||
							operatorStack.peek() == '*' ||
							operatorStack.peek() == '/')) 
				{
					processAnOperator(operandStack, operatorStack);
				}
				
				
				//Push the + or - operator into the operator stack
				
				operatorStack.push(token.charAt(0));
			}
			
			else if (token.charAt(0)== '*'|| token.charAt(0) == '/')
			{
				//Process all +, -, *, / in the top of operator stack
				
				while(!operatorStack.isEmpty() && 
							(operatorStack.peek() == '*' ||
							 operatorStack.peek() == '/')) 
				{
					processAnOperator(operandStack, operatorStack);
				}
				
				
				//Push the + or - operator into the operator stack
				
				operatorStack.push(token.charAt(0));
			}
			
			else if (token.trim().charAt(0) == '(') 
			{
				operatorStack.push('(');
			}
			
			else if (token.trim().charAt(0) == ')') 
			{
				
				//Process all operators in the stack until seeing '('
				while(operatorStack.peek() != '(') 
				{
					processAnOperator(operandStack, operatorStack);
				}
				
				operatorStack.pop();	//Pop the '(' symbol from the stack
			}
			else 
			{
				//An operand scanned
				//Push an operand to the stack
				operandStack.push(new Integer(token));
				
				
			}


		}
		
		//Phase 2: Process all remaining operators in the stack
		
		while(!operatorStack.isEmpty()) 
		{
			processAnOperator(operandStack, operatorStack);
		}
		
		
		//return the result
		
		return operandStack.pop();
	
	}
	
	
	/**Process one operator: Take an operator from operator stack and apply it on the operands in the operands stack*/
	
	public static void processAnOperator(Stack<Integer> operandStack, Stack<Character>operatorStack) 
		 {
			 char op = operatorStack.pop();
			 int op1 = operandStack.pop();
			 int op2 = operandStack.pop();
			 
			 if(op == '+')
				 operandStack.push(op2 + op1);
			 else if(op=='-')
				 operandStack.push(op2-op1);
			 else if(op=='*')
				 operandStack.push(op2*op1);
			 else if(op=='/')
				 operandStack.push(op2/op1);
			 
		 }
		 
		 
		 
   public static String insertBlanks(String s) 
   
	 {
		 String result = "";
		 
		 for (int i = 0; i < s.length(); i++) 
		 {
			 if(s.charAt(i)== '(' || s.charAt(i)==')'||
					 s.charAt(i)== '+' || s.charAt(i)=='-'||
					 s.charAt(i)== '*' || s.charAt(i)=='/')
				 
				 result += " " + s.charAt(i) + " ";
			 else
				 result += s.charAt(i);
		 }
		 
		 
		 return result;
	 }

}
