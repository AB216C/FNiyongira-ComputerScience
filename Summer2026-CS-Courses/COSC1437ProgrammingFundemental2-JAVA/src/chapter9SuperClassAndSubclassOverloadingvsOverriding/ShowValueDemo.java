package chapter9SuperClassAndSubclassOverloadingvsOverriding;

public class ShowValueDemo {

	public static void main(String[] args) {
		

		//Create a subclas sobject
		
		
		SubClass3 object = new SubClass3();
		
		object.showValue(23);
		object.showValue(32.45);
		object.showValue("Peter");
		
	}

}
