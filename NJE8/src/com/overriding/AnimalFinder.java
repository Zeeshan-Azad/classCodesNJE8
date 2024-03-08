package com.overriding;

public class AnimalFinder {
	public static void main(String[] args) {
		
		Cat c = new Cat("Cats", "Fluffu", 4, true, "White & Black", "Indian", 6);
		
		c.eat();
		
		c.sleep();
		
		c.hitClaws(); //spcific Cat class method
		
		c.makeSound(); //since it is overridden by Cat class, we will get implementation from Cat
		
		c.add(10,12);
		
		c.add("apple", 10);
	}
}
