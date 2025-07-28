package com.springcore.springcore;

public class Customer {
	private int CarNumber;
	private String Name;
	private String Country;

	public Customer(int CarNumber, String Name, String Country) {
		this.Name = Name;
		this.Country = Country;
		this.CarNumber = CarNumber;
	}

	public void setCarNumber(int CarNumber) {
		this.CarNumber = CarNumber;
	}

	public int getCarNumber() {
		return CarNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Customer [CarNumber=" + CarNumber + ", Name=" + Name + ", Country=" + Country + "]";
	}
}
