package com.springcore.springcore;

public class Vehicle {
	private Car car;

	public Vehicle(Car car) {
		this.car = car;
	}

	public void TodaysCar(String CarType) {
		car.CarType(CarType);
	}

}
