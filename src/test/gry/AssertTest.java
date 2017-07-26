package test.gry;

public class AssertTest {

	public static void main(String[] args) {
		int a = 10;
		assert a == 12 : "assertion failed";
		System.out.println( "assertion passed" );
	}

}
