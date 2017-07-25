package test.gry;

public class PolymorphismTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.cry();
		
		animal = new Dog();
		animal.cry();
		
		animal = new Cat();
		animal.cry();
	}

}

class Animal{
	public void cry() {
		System.out.println("I do not konw how");
	}
}

class Dog extends Animal{
	public void cry() {
		System.out.println("wang wang");
	}
}

class Cat extends Animal{
	public void cry() {
		System.out.println("miao miao");
	}
}