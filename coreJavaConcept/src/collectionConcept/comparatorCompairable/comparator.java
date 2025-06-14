package collectionConcept.comparatorCompairable;

import java.util.ArrayList;
import java.util.Collections;

public class comparator {

	public static void main(String args[]) {
		ArrayList<studentData> arrList = new ArrayList<>();
		arrList.add(new studentData(101, "Rahul", 25));
		arrList.add(new studentData(10, "Komal", 20));
		arrList.add(new studentData(55, "Sarita", 50));
		System.out.println("Before comparable " + arrList);
		Collections.sort(arrList, new ageComparator());
		System.out.println("After comparable " + arrList);
		
		
		System.out.println("Before name comparable " + arrList);
		Collections.sort(arrList, new nameComparator());
		System.out.println("After  name comparable " + arrList);
	}

}
