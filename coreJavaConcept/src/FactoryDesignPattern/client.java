package FactoryDesignPattern;

public class client {
	public static void main(String args[]) {
	empleySalary fectory=fectoryClass.getSalary("Developer");
	System.out.println(fectory.salary());
	}
}
