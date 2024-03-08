package com.parameters;

import java.util.Scanner;

public class StudentRegistrationPortal {
	public static void main(String[] args) {
		System.out.println("Welcome to this year registeration portal");
		int startId = 11;
		String studentId = "PCS00" + startId;
		
		
		Student s1 = new Student();
		s1.setDetails("Zeeshan", "Yusuf Azad", 29, 9898989797l, studentId, 987687657654l, 20240120130012l, 20000);
		
		
		StudentDatabase.recordDetails(s1);

		
		//aise hi 5 aur student aur unke detailing mei 2X5 = 10 lines aur   54--> 12
	}
}









