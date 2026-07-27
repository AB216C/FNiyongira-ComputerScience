package chapter8WrapperClasses;

public class StringBuilderObjects {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder();

		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		System.out.println("Next \n");
		
		sb.append("Java");

		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		System.out.println("Next \n");
		
		
		StringBuilder sbuild = new StringBuilder(50);

		System.out.println(sbuild.length());
		System.out.println(sbuild.capacity());


		sbuild.append("Computer Science");

		System.out.println(sbuild);
		System.out.println(sbuild.length());
		System.out.println(sbuild.capacity());

		
		System.out.println("Next \n");

		StringBuilder str = new StringBuilder("New City");
		str.insert(4, "York");
		System.out.println(str);

		System.out.println("Next Example \n");
		
		char[] cArray = {'2','0',' '};
		
		StringBuilder stringb = new StringBuilder("In June we sold cars.");
		
		stringb.insert(16, cArray);
		System.out.println(stringb);
		
		
		System.out.println("Next Example \n");
		
		StringBuilder str2 =new StringBuilder ("We moved from Chicago to Atlanta.");

		str2.replace(14, 21, "New York");
		System.out.println(str2);

		
		System.out.println("Next Example \n");
		
		
		StringBuilder str3 =
				   new StringBuilder("I ate 100 blueberries!");

		// Display the StringBuilder object.
		System.out.println(str3);

		// Delete the '0'.
		str3.deleteCharAt(8);
		
		System.out.println(str3);

		// Delete "blue".
		str3.delete(9, 13);

		// Display the StringBuilder object.
		System.out.println(str3);

		// Change the '1' to '5'
		str3.setCharAt(6, '5');

		// Display the StringBuilder object.
		System.out.println(str3);
		

		System.out.println("Next Example \n");
		

		StringBuilder strb = new StringBuilder("This is a test");

		String str1 = strb.toString();
		
		System.out.println(str1);



	}

}
