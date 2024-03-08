package com.typecasting;

public class AnimalBeareu {
	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.animalType = "Pet Animal";
		a.nameAnimal = "Vinci";
		a.numLegs = 4;
		
		AnimalTreatmentCentre.admitAnimal(a);
		
	}
}
