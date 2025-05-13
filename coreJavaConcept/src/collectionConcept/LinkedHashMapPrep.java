package collectionConcept;

import java.util.LinkedHashMap;

public class LinkedHashMapPrep {

	public static void main(String args[]) {
		LinkedHashMap<String,Integer> LRU=new LinkedHashMap<String, Integer>(11,0.75f,true);
		LRU.put("Apple", 10);
		LRU.put("Bannana",20);
		LRU.put("Mango", 40);
		LRU.put("Pineapple",30);
		System.out.println(LRU);
		LRU.get("Apple");
		System.out.println(LRU);
		
	}
}
