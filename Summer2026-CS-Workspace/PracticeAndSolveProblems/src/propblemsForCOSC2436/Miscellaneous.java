package propblemsForCOSC2436;

import java.util.*;

public class Miscellaneous {

	public static void main(String[] args) {
		

		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.remove(2);
		
		
		System.out.println(list);
		
		
		
		
		//Double ended queue
		

		List<String> list2 = new ArrayList<>();
		
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
	
		
		for (int i=0; i<list2.size(); i++) 
		{
			
			//System.out.println(list2.get(i));
			System.out.println(list2.remove(i));
		}

		
	}

}
