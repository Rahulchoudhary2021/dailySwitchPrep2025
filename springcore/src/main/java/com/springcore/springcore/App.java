package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Constructor Injection***
		Vehicle vehicle = (Vehicle) context.getBean("Vehicle");
		vehicle.TodaysCar("ODD");
		vehicle.TodaysCar("BMW");
		//Setter Injection***
		Customer customer = (Customer) context.getBean("Customer");
		System.out.println(customer);
	}
}
