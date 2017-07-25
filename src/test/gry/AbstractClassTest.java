package test.gry;

public class AbstractClassTest {

	public static void main(String[] args) {
		Juice juice = new Juice();
		juice.print();
		
		Coke coke = new Coke();
		coke.print();
	}
}

abstract class Drink{
	String name;
	// you have to realize the function if you do not have the 
	public abstract void print();
}

class Juice extends Drink{
	@Override
	public void print() {
		System.out.println("my name is juice");
	}
}

class Coke extends Drink{
	@Override
	public void print() {
		System.out.println("my name is coke");
	}
}