package collectionConcept.comparatorCompairable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Compairable {

	public static void main(String args[]) {

		// ****when you compair only integer

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(15);
		arr.add(1);
		arr.add(10);

		Collections.sort(arr);
		System.out.println(arr);

		// ***** when you compair two object
		// **** when you want single shorting logic use compairable (or natural order
		// shorting)

		ArrayList<empData> arrList = new ArrayList<>();
		arrList.add(new empData(101, "Rahul", 25));
		arrList.add(new empData(10, "Komal", 20));
		arrList.add(new empData(55, "Sarita", 50));
		System.out.println("Before comparable " + arrList);
		Collections.sort(arrList);
		System.out.println("After comparable " + arrList);
	}
}
