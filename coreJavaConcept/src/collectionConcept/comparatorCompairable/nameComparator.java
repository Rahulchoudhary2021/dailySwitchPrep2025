package collectionConcept.comparatorCompairable;

import java.util.Comparator;

public class nameComparator  implements Comparator<studentData>{

	@Override
	public int compare(studentData o1, studentData o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}


}
