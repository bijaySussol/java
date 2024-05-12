package super_java;

public class Animal {
	int age;
	String name;
	
	// Default constructor
	public Animal() {};
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("I made a noise");
	}
	
	public void eat() {
		System.out.println("I am eating");
	}
	
	private void doSomethingPrivate() {
		System.err.println("I am private method on Superclass only.");
	}

}
