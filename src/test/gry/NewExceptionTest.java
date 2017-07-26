package test.gry;

public class NewExceptionTest {

	static void compute(int a) throws MyException 
	{
		System.out.println("Called compute(" + a + ")");
		if(a > 10)
			throw new MyException(a);
		System.out.println("Normal exit");
	}
	
	public static void main(String[] args) throws MyException {
		try {
			compute(4);;
			compute(20);;
		}
		catch (MyException e) {
			System.out.println("Caught " + e);
		}
		
	}

}

class MyException extends Exception {
	private int detail;
	
	public MyException(int a) {
		detail = a;
	}
	
	public String toString() {
		return "MyException[" + detail + "]";
	}
}