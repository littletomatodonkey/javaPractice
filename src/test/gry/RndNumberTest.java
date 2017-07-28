package test.gry;

public class RndNumberTest {

	public static void main(String[] args) {
		int min = 0;
		int max = 1;
		System.out.println("min number is : " + min + ", max number is : " + max);
		for (int i = 0; i < 10; i++) {
			System.out.println( (int)(Math.random()*(max-min+1)+min) );
		}
		
	}

}
