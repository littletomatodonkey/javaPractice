package test.gry;

public class ThrowExceptionTest {

	public static void main(String[] args) {
		try {
		     throwOne();
		} catch (IllegalAccessException e) {
		     System.out.println("Caught " + e);
		}
	}
	
	static void throwOne() throws IllegalAccessException {
	      System.out.println("Inside throwOne.");
	      throw new IllegalAccessException("demo");
	   }

}
