package java_Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal = new Animal();
		myAnimal.eat();
		
		Dog myDog = new Dog();
		myDog.eat();
		
		myDog.eat(2);
		myDog.eat();
		Cat myCat = new Cat();
		myCat.eat();
	}
}
