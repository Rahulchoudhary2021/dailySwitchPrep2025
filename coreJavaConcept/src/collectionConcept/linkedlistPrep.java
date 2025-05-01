package collectionConcept;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class linkedlistPrep {
	public static void main(String[] arsg) {
		// mutable list...
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Rahul");
		// I need immutable list..
		List<String> immuList = List.of("A", "B");// comes in java 9
		// before java 9 there is arrays but it is Partially mutable
		String[] arr = { "c", "d" };
		List<String> listArr = Arrays.asList(arr);
		listArr.set(0, "e");
		// you can make list as mutable also
		ArrayList<String> arrList2 = new ArrayList<>(immuList);
		arrList2.add("c");
		System.out.println(arrList2);
	}
}
