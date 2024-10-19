package java_Polymorphism;

public class Cat extends Animal {
	private String litterPreference;
	
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public String getlitterPreference() {
		return litterPreference;
	}
	
	public void setlitterPreference(String litterPreference) {
		this.litterPreference = litterPreference;
	}
	
}
