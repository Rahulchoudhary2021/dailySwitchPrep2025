package collectionConcept.comparatorCompairable;

public class empData implements Comparable<empData> {
	private int empId;
	private String name;
	private int age;

	public empData(int empId, String name, int age) {
		this.age = age;
		this.name = name;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getEmpId() {
		return empId;
	}

	public String toString() {
		return "empData [empId =" + empId + " name = " + name + " age=" + age + "] ";
	}

	@Override
	/*public int compareTo(empData o) {
		return this.empId - o.empId;
	}*/
	
	public int compareTo(empData o) {
		return this.name.compareTo(o.name) ;
	}

}
