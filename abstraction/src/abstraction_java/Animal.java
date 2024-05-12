package abstraction_java;

public abstract class Animal {
	int age;
	String name;
	
	public Animal(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public abstract void makeNoise();
	public void printName(String name, int age) {
		System.out.println("Name is: " + name + " Age is: " + age);
	}
}
