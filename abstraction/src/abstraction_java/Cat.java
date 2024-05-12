package abstraction_java;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("Cat made Meow Meow");
		
	}
}
