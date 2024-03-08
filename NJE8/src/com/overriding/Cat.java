package com.overriding;

public class Cat extends Animal{
	String breed;
	int numberWhiskers;
	
	
	
	public Cat(String animalType, String animalName, int numberLegs, boolean isPet, String color, String breed,
			int numberWhiskers) {
		super(animalType, animalName, numberLegs, isPet, color);
		this.breed = breed;
		this.numberWhiskers = numberWhiskers;
	}

	void hitClaws() {
		System.out.println(animalName + " of type " + animalType + " of breed " + breed + " is panje maar rahi");
	}
	
	//eat sleep makeSound
	
	@Override
	public void makeSound() {
		System.out.println("Meow meow");
	}
	
	
	int add(int a, int b) {
		System.out.println("inside add of super class");
		return 20;
	}
	
	
	//specifically cat property
	void add(String s, int l) {
		System.out.println("Specially from Cat class");
	}
	
	
}









