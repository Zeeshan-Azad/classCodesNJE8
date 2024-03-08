package com.overriding;

public class Animal {
	String animalType;
	String animalName;
	int numberLegs;
	boolean isPet;
	String color;
	
	
	public Animal(String animalType, String animalName, int numberLegs, boolean isPet, String color) {
		super();
		this.animalType = animalType;
		this.animalName = animalName;
		this.numberLegs = numberLegs;
		this.isPet = isPet;
		this.color = color;
	}
	
	
	public Animal() {
		super();
	}
	
	
	void eat() {
		System.out.println(animalName + " eats");
	}
	
	void sleep() {
		System.out.println(animalType + " sleeps");
	}
	
	void makeSound() {
		System.out.println(animalType + " makes sound");
	}
	
	int add(int a, int b) {
		System.out.println("inside add of super class");
		return 10;
	}
	
	
}
