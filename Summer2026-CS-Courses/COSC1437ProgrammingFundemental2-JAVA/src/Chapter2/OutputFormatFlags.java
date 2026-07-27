package Chapter2;

public class OutputFormatFlags {

	public static void main(String[] args) {

		//Using comma separator
		
		double number = 123456666.67;
		
		
		//Notice adding a comma(,) before f will produce a more readable output
		
		System.out.printf("%,f \n",number);
		
		
		//Now add comma separator and round the number
		
		
		
		System.out.printf("%,.2f \n", number);
		
		// Combine minimum width with comma separators
		
		int num = 20000;
		
		System.out.printf("%,8d \n", num);
		
		
		// Padding numbers with leading zeros
		// This will replace added empty spaces with zeros(fill empty space with zeros)
		
		System.out.printf("%,08d\n", num);
		
		
		
		// Left justified numbers
		
		//When a number is shorter than a field it is displayed, it is right-justfied
		// Example is setting minimum width create the right-justified numbers
		//To make the number left-justified, you insert negative sign(-) in front of format specifier
		
		
		int num1 = 123;
		int num2 = 12;
		
		int num4 = 23;
		int num5 = 1299;
		
		
		System.out.printf("Case 1 left justified: %-8d%8d \n",num1, num2);  //Notice too much space on the right side of num1
		System.out.printf("Case 2 left justified: %-8d%8d \n",num4, num5); //Notice too much space on the right side of num4
		
		
		// Formatting string arguments
		
		String name1 = "Grace";
		String name2 = "Peter";
		
		
		System.out.printf("%-8s%8s",name1, name2);


		
		

		
	}

}
