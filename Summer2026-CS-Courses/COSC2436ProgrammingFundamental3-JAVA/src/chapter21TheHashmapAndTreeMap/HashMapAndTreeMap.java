package chapter21TheHashmapAndTreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class HashMapAndTreeMap {

	public static void main(String[] args) {


		//Create a HashMap
		
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("Smith", 30);
		hashMap.put("Anderson", 31);
		hashMap.put("Lewis", 29);
		hashMap.put("Cook", 29);
		
		
		System.out.println("Display entries in HashMap");
		
		System.out.println(hashMap + "\n");
		
		//Create a tree map from the proceeding hashMap
		
		
		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		
		System.out.println("Display the entries in the ascending order of key");
		
		System.out.println(treeMap);
		
		
		System.out.println("\n Names and Ages are \n");
		
		treeMap.forEach((name, age)->System.out.println(name + ":" + age + " "));
		
		
		//Create a LinkedHashMap
		
		System.out.println("\n=========================================\n");
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
		
		linkedHashMap.put("Smith", 30);
		linkedHashMap.put("Anderson", 31);
		linkedHashMap.put("Lewis", 29);
		linkedHashMap.put("Cook", 29);
		
		
		//Display the age for Lewis
		
		System.out.println("The age of Lewis is " + linkedHashMap.get("Lewis"));
		
		
		//Display each entry with the name and the age
		
		System.out.println("\n Names and Ages are \n");
		
		linkedHashMap.forEach((name, age)->System.out.println(name + ":" + age + " "));
		
		
		
		
		
	}

}
