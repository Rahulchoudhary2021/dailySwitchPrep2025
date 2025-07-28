package SerializableAndDeSerializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LoadStudent {
	public static void main(String args[]) {
		try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("D:/JAVA_PRE/student.txt"))){
			List<Student> student=(List<Student>) os.readObject();
			for(Student s : student) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
