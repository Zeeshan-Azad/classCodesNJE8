package com.inheritance;

import java.util.Scanner;

public class TestUpcasting {
	public static void main(String[] args) {
		
		//upcasting
		Vehicle v = new Car();  //car object is upcasted into Vehicle reference
		
		//can access general properties
		v.isElectric = false;
		v.numberWheels = 4;
		v.vehicleType = "Car";
		v.cc = 1500;
		v.showDetails();
		
		
		
		
	

		
		
	}
}