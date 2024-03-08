package com.inheritance;

public class OfficeParking {
	String parkingName;
	
	
	public static void parkVehicle(Vehicle v) {
		
		if( v instanceof Car) {
			System.out.println("This is a car");
			System.out.println(10);
			System.out.println(false);
			System.out.println('a');
			System.out.println(10.24);
			
			Car c = (Car)v;
			c.display();
			
		}
		else {
			System.out.println("This is a bike");
			
			Bike b = (Bike)v;
			b.display();
			
		}
	}
	
	
}
