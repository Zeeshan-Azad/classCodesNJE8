package com.typecasting;

public class AnimalTreatmentCentre {
	
	public static void admitAnimal(Animal a) { 
		//Animal a = new Dog();
		
		//specific property chaiye
		//downcast krke
		
		Cat c = (Cat)a;
		c.meow();
		
	}
}
