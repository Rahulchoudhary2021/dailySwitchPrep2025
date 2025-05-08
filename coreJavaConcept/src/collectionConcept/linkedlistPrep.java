package collectionConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class linkedlistPrep {
	private static final boolean String = false;

	public static void main(String[] args) {
		// Mutable list
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Rahul");

		// Immutable list (Java 9+)
		List<String> immuList = List.of("A", "B");

		// Partially mutable list via Arrays.asList
		String[] arr = { "c", "d" };
		List<String> listArr = Arrays.asList(arr);
		listArr.set(0, "e"); // Modifiable elements
		// listArr.add("f"); // Would throw UnsupportedOperationException

		// Making an immutable list mutable
		ArrayList<String> arrList2 = new ArrayList<>(immuList);
		arrList2.add("c");
		System.out.println(arrList2);

		// Sorting example using manual conversion
		int[] array = { 2, 6, 1, 3, 4, 5 };
		ArrayList<Integer> arrList3 = new ArrayList<>();
		for (int value : array) {
			arrList3.add(value);
		}
		System.out.println("Before sort: " + arrList3);

		// Sorting dynamic list
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(1, 4, 6, 2, 5, 3));
		Collections.sort(arr3);
		System.out.println("After sort: " + arr3);

		// LinkedList usage
		LinkedList<Integer> linkList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
		linkList.addFirst(0);
		linkList.removeLast();
		System.out.println("LinkedList: " + linkList);

		// work on stack...
		Stack<Integer> stc = new Stack<Integer>();
		stc.push(1);
		stc.push(2);
		stc.push(3);
		stc.pop();
		System.out.println(stc.search(1));

		// Linked List work as stack:::

		LinkedList<Integer> link = new LinkedList<Integer>();
		link.addLast(1);
		link.addFirst(2);
		link.add(3);
		System.out.println(link);

		// Array List also work as stack but need to write more code::
		ArrayList<Integer> arr1List = new ArrayList<>();
		arr1List.add(2);
		arr1List.addFirst(1);
		arr1List.addLast(3);
		arr1List.removeLast();
		System.out.println(arr1List);

		// Copy on write array list:::
		List<String> copyList = new CopyOnWriteArrayList<String>();
		copyList.add("Milk");
		copyList.add("Pen");
		copyList.add("Fruits");
		copyList.add("Tea");
		for (String items : copyList) {
			if (items == "Milk") {
				copyList.add("EGG");
			}
		}
		System.out.println(copyList);

	}
}
