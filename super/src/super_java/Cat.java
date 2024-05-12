package super_java;

public class Cat extends Animal{
	
	String catFoodPreference;
	
	public Cat(int age, String name, String catFoodPreference) {
		// super(age, name, "Test");// Cannot do this superclass constructor does not know what 3rd parameter sent to
		super(age, name);
		this.catFoodPreference = catFoodPreference;
	}
	
	@Override
	public void makeNoise() {
		super.makeNoise(); // Calling the Superclass method implementation
		System.out.println("Meow Meow");
		eat();
		// super.doSomethingPrivate();// Private method on superclass is private to superclass only
	}
}