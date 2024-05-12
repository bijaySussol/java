package super_java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat(10, "Back Cat", "Milk");
		myCat.makeNoise();
		System.err.println(myCat.age + " "+ myCat.name + " "+ myCat.catFoodPreference);
		// myCat.super.makeNoise(); // Cannot call from main class call has to be made from the child class
	}
}