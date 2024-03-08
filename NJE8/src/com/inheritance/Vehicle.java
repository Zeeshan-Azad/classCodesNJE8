package com.inheritance;

public class Vehicle {
	String vehicleType;
	int numberWheels;
	boolean isElectric;
	int cc;
	
	public void showDetails() {
		System.out.println(vehicleType);
		System.out.println(numberWheels);
		System.out.println(isElectric);
	}
}
