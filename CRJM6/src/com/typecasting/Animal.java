package com.typecasting;

public class Animal {
	String nameAnimal;
	int numLegs;
	String animalType;
	
	void makeSound() {
		System.out.println(nameAnimal + " is making sound");
	}
	
	void eat() {
		System.out.println(animalType + " eats what master gives");
	}
}
