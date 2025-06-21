package designPatternJava;

import java.lang.reflect.Constructor;


	//Use Enum********************
public enum singletonPatteren{	
	Instance;
	public static singletonPatteren doSomething() {
		return Instance;
	}
//public class singletonPatteren {	
	// lazy way********************
//	private static singletonPatteren instance;
//
//	private singletonPatteren() {
//		// prevent from reflection api
//		if (instance != null) {
//			throw new RuntimeException("use singletonPatteren.getInstance(); for single Instance");
//		}
//	}
//
//	public static singletonPatteren getInstance() {
//		if (instance == null) {
//			synchronized (singletonPatteren.class) {
//				instance = new singletonPatteren();
//			}
//		}
//		return instance;
//	}

	public static void main(String args[]) {
//		singletonPatteren s1 = singletonPatteren.getInstance();
//		singletonPatteren s2 = singletonPatteren.getInstance();
//		System.out.println(s1 == s2);
		
		singletonPatteren s1 = singletonPatteren.doSomething();
		singletonPatteren s2 = singletonPatteren.doSomething();
		System.out.println(s1 == s2);
		// Eager way*******************
//	
//	private static final singletonPatteren eagerInstance=new singletonPatteren();
//	
//	private singletonPatteren() {
//		
//	}	
//	private static singletonPatteren getInstance() {
//		return eagerInstance;
//	}	
//	public static void main(String args[]) {
//		singletonPatteren s1=singletonPatteren.getInstance();
//		singletonPatteren s2=singletonPatteren.getInstance();
//		System.out.println(s1==s2);
//	}

		// **************Reflection break the singleton patteren

//		singletonPatteren s3 = singletonPatteren.getInstance();// first create instance
//		singletonPatteren s4 = null;
//
//		try {
//			Constructor<singletonPatteren> constructor = singletonPatteren.class.getDeclaredConstructor();
//			// singletonPatteren.class is se constructor object nikal lia
//			// .getDeclaredConstructor();is se private access object access kar sakta ha
//
//			constructor.setAccessible(true);// ab private access kar sakta ha
//
//			s1.getInstance();
//			s2 = constructor.newInstance();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("Reflection check: " + (s3 == s4));

	}
}
