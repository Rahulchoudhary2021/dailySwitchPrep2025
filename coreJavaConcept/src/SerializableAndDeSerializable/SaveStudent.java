package SerializableAndDeSerializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SaveStudent {
	public static void main(String args[]) {
		List<Student> student = new ArrayList<Student>();
		student.add(new Student(1, "RAHUL", "BCA"));
		student.add(new Student(2, "KOMAL", "MCA"));
		student.add(new Student(3, "NEHA", "BTECH"));
		student.add(new Student(4, "SURESH", "BCA"));

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:/JAVA_PRE/student.txt"))) {
			os.writeObject(student);
			System.out.println("Student Created sucessfully");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
