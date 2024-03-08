package com.inheritance;

public class Bike extends Vehicle{
	String bikeBrand;
	double hp;
	String fuelType;
	
	public void display() {
		System.out.println(bikeBrand);
		System.out.println(hp);
		System.out.println(fuelType);
	}
}
