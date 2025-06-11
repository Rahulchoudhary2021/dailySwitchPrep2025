package collectionConcept;

import java.util.LinkedList;

public class comparatorCompairable {

	public static void main(String args[]) {

		LinkedList<String> list = new LinkedList<>();
		list.add("apple");
		list.add("vegetable");
		list.add("mango");
		//list.sort(null);
		list.sort((a,b)->b.length()-a.length());
		System.out.println("list"+list);
		

	}
}
