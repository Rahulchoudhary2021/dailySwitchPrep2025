package designPatternJava;

public enum SingletonEnumPattern {
	Instance;

	private static SingletonEnumPattern doSomeThing() {
		return Instance;
	}

	public static void main(String args[]) {
		SingletonEnumPattern s1 = SingletonEnumPattern.doSomeThing();
		SingletonEnumPattern s2 = SingletonEnumPattern.doSomeThing();
		System.out.println(s1 == s2);
	}

}
