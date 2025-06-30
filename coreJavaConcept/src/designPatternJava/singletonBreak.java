package designPatternJava;

import java.io.Serializable;

public class singletonBreak implements Serializable {
	private static singletonBreak instance;

	private singletonBreak() {
		if(instance!=null) {
			throw new RuntimeException("Use getInstance() method, reflection is not allowed");
		}

	}

	public static singletonBreak getInstance() {

		if (instance == null) {
			synchronized (singletonBreak.class) {
				if (instance == null) {
					instance = new singletonBreak();
				}
			}
			return instance;
		}

		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
}
