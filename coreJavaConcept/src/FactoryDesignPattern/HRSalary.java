package FactoryDesignPattern;

public class HRSalary implements empleySalary {
   public Integer salary() {
	   System.out.println("HR salary..");
		return 30000;	   
   }
}
