package SerializableAndDeSerializable;

import java.io.Serializable;

public class Student implements Serializable {
	public int Id;
	public String Name;
	public String Course;

	public Student(int Id, String Name, String Course) {
		this.Id = Id;
		this.Name = Name;
		this.Course = Course;
	}

	public String toString() {
		return "LoadStudent [Id=" + Id + ", Name=" + Name + ", Course=" + Course + "]";
	}

}
