package chapter5;

public class NestedLoopsClock {

	public static void main(String[] args) {
		
		
		int hour;
		int minute;
		int second;
		
		
		
		for (hour = 1; hour<=1; hour++) 
		{
			for (minute = 0; minute <= 59; minute++) 
			{
				for (second = 0; second <= 59; second++) 
				{
					System.out.printf("%02d:%02d:%02d \n", hour, minute, second);
				}
			}
		}
	}

}
