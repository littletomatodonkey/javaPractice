package test.gry;

public class ExceptionTest {
	
	public static void subZeroTest() {
		try
		{
			int a = 2, b = 0;
			int res = a / b;
		}
		catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	
	public static void main(String[] args) {
		
		subZeroTest();
		
		
		String arr[] = {"1234", "akmdbjv", "l354f", "24389d"};
		
		int res = 0;
		for( int i = 0; i<arr.length;i++ )
		{
			try {
				res = Integer.parseInt(arr[i]);
				System.out.println(arr[i] + " ----> " + res);
			} catch (Exception e) {
				System.out.println(e.toString());
				System.out.println(arr[i] + " can not be coverted...");
			}
		}

	}

}
