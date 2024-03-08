package com.parameters;

public class Student {
	String name;
	String fatherName;
	int age;
	long mobile;
	String studentId;
	long uid;
	long studentEnrollmentValue;
	int feesDue;
	String almirahNumber;
	
	void showDetails() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.mobile);
		System.out.println(this.uid);
		System.out.println(this.fatherName);
		System.out.println(this.studentId);
	}
	
	void setDetails(String name, String fatherName, int age, long mobile, String studentId, long uid, long studentEnrollmentValue, int feesDue) {
		this.name = name;
		this.fatherName = fatherName;
		this.age = age;
		this.mobile = mobile;
		this.studentId = studentId;
		this.uid = uid;
		this.studentEnrollmentValue = studentEnrollmentValue;
		this.feesDue = feesDue;
		
	}
	
	void showFeesDue(long mobile, long studentEnrollmentValue) {
		if(this.mobile == mobile && this.studentEnrollmentValue == studentEnrollmentValue) {
			System.out.println(this.feesDue);
		}
		else {
			System.out.println("Invalid credentials");
		}
	}
}
