package chapter8WrapperClassForNumericalValues;

public class GetSmallestLargestValueFromPrimitiveDataTypeUsingWrapperClass {

	public static void main(String[] args) {
		

		//Each wrapper class have a set of static final variables named MIN_VALUE AND MAX_VALUE
		//Notice:Primary purpose of Wrapper class is to wrap primitive data types
		
		System.out.println("Smallest Integer" + Integer.MIN_VALUE);
		System.out.println("Largest Integer" + Integer.MAX_VALUE);
		
		
		
		System.out.println("Smallest Byte" + Byte.MIN_VALUE);
		System.out.println("Smallest Long"+ Long.MIN_VALUE);
		
		System.out.println("Largest Float" + Float.MAX_VALUE);
		System.out.println("Largest Double"+Double.MAX_VALUE);
	}

}
