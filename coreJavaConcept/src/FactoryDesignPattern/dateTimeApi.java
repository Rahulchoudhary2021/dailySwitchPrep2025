package FactoryDesignPattern;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class dateTimeApi {
public static void main(String rags[]) {
	LocalDate localDate=LocalDate.now();
	LocalDate dtaeOfBirth=LocalDate.of(1999,Month.JUNE,8);
	Period age=Period.between(dtaeOfBirth,localDate);
	System.err.println("Your Age Is : "+age.getYears());
	
	Object obj="Rahul";
	if(obj instanceof String str) {
		System.out.println(str.toUpperCase());
		
	} 
	
	
	product p=new product(17, "Rahul");
	System.out.println(p.name());
}
}
