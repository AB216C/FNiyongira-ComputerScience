package Chapter2;

public class OutputFormatted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double value1 = 3.0;
		double value2 = 6.0;
		double value3 = 9.0;
		
		
		// The code print double or float numbers but which are not rounded to any decimal 
		
		System.out.printf("%f %f %f \n",value1, value2, value3);
		
		
		double bvalue1 = 123.456789;
		double bvalue2 = 123.456778;
		double bvalue3 = 123.456778;
		
		
		
		//The code print numbers rounded to one, two or three decimals(precision)
		
		System.out.printf("%.1f %.2f %.3f \n",bvalue1, bvalue2, bvalue3);
		
		
		//Set minimum field width
		
		double number = 12345.6789;
		
		System.out.printf("decimal with minimum width: %1f \n",number);
		System.out.printf("decimal with minimum width: %4f \n",number);
		System.out.printf("decimal with minimum width: %8f \n",number);
		
		
		
		//This will create 6 character space and in front of 200, there three empty character space
		
		int number2 = 200;
		
		System.out.printf("Integer with minimum width: %6d \n",number2);
		
		
		// Combine minimum field width and precision in the same format specifier
		
		double num1 = 127.899;
		double num2 = 3465.456;
		double num3 = 3.776;
		double num4 = 264.821;
		double num5 = 88.081;
		double num6 = 1799.999;
		
		//Display each variable : 8 spaces and 2 decimal field
		
		
		System.out.printf("Num1:%8.2f \n", num1);
		System.out.printf("Num2:%8.2f \n", num2);
		System.out.printf("Num3:%8.2f \n", num3);
		System.out.printf("Num4:%8.2f \n", num4);
		System.out.printf("Num5:%8.2f \n", num5);
		System.out.printf("Num6:%8.2f \n", num6);


	}

}
