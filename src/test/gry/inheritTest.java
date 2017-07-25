package test.gry;

import java.time.Period;

public class inheritTest {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.name = "lw";
		teacher.school = "bj";
		
		teacher.say();
		
		People people = new Teacher( ); // subclass -> parent class
		people.say();
		System.out.println(people.getClass());
		
		
	}

}
