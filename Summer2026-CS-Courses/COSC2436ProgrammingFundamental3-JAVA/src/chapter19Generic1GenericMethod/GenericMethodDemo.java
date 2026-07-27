package chapter19Generic1GenericMethod;

public class GenericMethodDemo {
	
	
	public static <E> void print(E[] list) 
	{
		for (int i = 0 ; i < list.length; i++) {
			System.out.print(list[i]+" ");
		System.out.println();
		}
	}

	public static void main(String[] args) {
		

		Integer[] integers = {1,2,3,4,5};
		
		GenericMethodDemo.<Integer>print(integers);		//1st method of printing values in the list
		print(integers);								//2nd method
		
		
		String[] strings = {"London", "Paris", "NewYork", "Paris"};
		
		GenericMethodDemo.<String>print(strings);
		print(strings);
		
	}
}

	
