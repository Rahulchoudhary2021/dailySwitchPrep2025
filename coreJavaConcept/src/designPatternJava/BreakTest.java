package designPatternJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakTest {
	public static void main(String args[]) throws ClassNotFoundException {
		singletonBreak s1 = singletonBreak.getInstance();
		System.out.println(s1.hashCode());

		singletonBreak s2 = singletonBreak.getInstance();
		System.out.println(s2.hashCode());

//		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Rahul_Data_Transfer"))) {
//			oos.writeObject(s1);
//			ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("D:\\Rahul_Data_Transfer"));
//			singletonBreak ss = (singletonBreak) ooi.readObject();
//			System.out.println(ss.hashCode());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
