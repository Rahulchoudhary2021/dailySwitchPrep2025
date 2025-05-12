package collectionConcept;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Rahul");
		map.put(2, "Komal");
		map.put(5, "Neha");
		map.put(3, "Suresh");
		map.put(4, "Sarita");
		map.put(6, "Sarita");
		// System.out.println(map);

//		keySet()	Set<K>	Keys must be unique → Set enforces uniqueness.

//		for (Integer i : map.keySet()) {
//			String value = map.get(i);
//			System.out.println("Key : " + i + " Value = " + value);
//		}

//	entrySet()	Set<Map.Entry<K,V>>	Each key-value pair is unique → Set prevents duplicates.

//		for(Map.Entry<Integer, String>entry : map.entrySet()) {
//			System.out.println("Key : "+entry.getKey() +" Value = "+entry.getValue());
//		}

		String[] arr= {"Orange","Apple","Bannana"};
		List<String> list =Arrays.asList(arr);
		
		List<String> list1=List.of("r","c","v");
		
		
		LinkedList<String> linkList=new LinkedList<>(Arrays.asList("r","c","v"));
		linkList.add("a");
		System.out.println();
	}
}
