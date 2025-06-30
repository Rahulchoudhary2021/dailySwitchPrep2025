package FactoryDesignPattern;

public class Developer implements empleySalary {

	public Integer salary(){
		System.out.println("Developer salary..");
		return 50000;
	}
}
