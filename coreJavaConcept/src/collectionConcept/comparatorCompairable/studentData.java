package collectionConcept.comparatorCompairable;

public class studentData {
	public int empId;
	public String name;
	public int age;

	public studentData(int empId, String name, int age) {
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

}
