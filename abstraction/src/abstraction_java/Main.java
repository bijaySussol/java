package abstraction_java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat("White Cat", 20);
		myCat.makeNoise();
		myCat.printName(myCat.name, myCat.age);
	}
}