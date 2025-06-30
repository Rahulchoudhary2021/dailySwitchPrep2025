package designPatternJava;

import java.lang.reflect.Constructor;

public class singletonReflectionPatter {
	private static singletonReflectionPatter Instance;

	private singletonReflectionPatter() {
		if (Instance != null) {
			throw new RuntimeException("use singletonPatteren.getInstance(); for single Instance");
		}
	}

	public static singletonReflectionPatter doSomething() {

		if (Instance == null) {
			synchronized (singletonReflectionPatter.class) {
				Instance = new singletonReflectionPatter();
			}
		}
		return Instance;
	}

	public static void main(String args[]) {
		singletonReflectionPatter s1 = new singletonReflectionPatter().doSomething();
		singletonReflectionPatter s2 = null;
		try {
			Constructor<singletonReflectionPatter> refConstructor = singletonReflectionPatter.class
					.getDeclaredConstructor();
			refConstructor.setAccessible(true);
			s2 = refConstructor.newInstance();
			System.out.println(s1 == s2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
