package test.gry;

public class InOutClassTest {

	public static void main(String[] args) {
		try {
			byte a[] = new byte[128];
			System.out.println("please input string : ");
			int cnt = System.in.read(a);
			for(int i=0;i<cnt;i++)
			{
				System.out.println( a[i] + "" );
			}
			System.out.println();
			for(int i=0;i<cnt-2;i++)
			{
				System.out.println( (char)a[i] + "" );
			}
			System.out.println();
			
			System.out.println(System.in.getClass());
			System.out.println(System.out.getClass());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
