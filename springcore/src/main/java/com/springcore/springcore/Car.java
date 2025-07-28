package com.springcore.springcore;

public class Car {
	public void CarType(String name) {
		switch (name) {

		case "ODD":
			System.out.println("Hii iam ODD !!");
			break;
		case "BMW":
			System.out.println("Hii iam BMW !!");
			break;
		case "MARUTI":
			System.out.println("Hii iam MARUTI !!");
			break;
		default:
			System.out.println("No Car !!");
			break;
		}
	}
}