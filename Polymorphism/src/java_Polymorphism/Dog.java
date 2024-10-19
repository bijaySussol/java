package java_Polymorphism;

import java.util.Iterator;

public class Dog extends Animal {
	
	private int breed;
	
	public void eat() {
		System.out.println("Dog Eating");
	}
	
	public void eat(int numberOfTimes) {
		for (int i = 0; i < numberOfTimes; i++) {
			System.out.println("Dog Eating overloading");
		}
	}
	
	public int getBreed() {
		return breed;
	}
	
	public void setBreed(int breed) {
		this.breed = breed;
	}
}
