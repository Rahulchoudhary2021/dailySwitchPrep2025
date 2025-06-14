package collectionConcept.comparatorCompairable;

import java.util.Comparator;

public class ageComparator implements Comparator<studentData> {

	@Override
	public int compare(studentData o1, studentData o2) {
		// TODO Auto-generated method stub
     return Integer.compare(o1.age, o2.age);
	}

}
