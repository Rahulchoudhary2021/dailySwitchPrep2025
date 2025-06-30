package FactoryDesignPattern;

public class fectoryClass {
	public static empleySalary getSalary(String salary) {
		if (salary == null) {
			return null;
		} else if (salary.equalsIgnoreCase("Developer")) {
			return new Developer();
		} else if (salary.equalsIgnoreCase("HR")) {
			return new HRSalary();
		}
		return null;
	}

}
