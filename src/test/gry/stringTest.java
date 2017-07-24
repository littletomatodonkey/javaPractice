package test.gry;
import java.util.Arrays;

public class stringTest {

	public static void main(String[] args) {
		//String s = new String("233333");
		String s = "233333";
		System.out.println( s );
		
		String re = "hello World Hello world!!";
		System.out.println( re.contains("hello") );
		
		String res = re.replace("Hello", "hha");
		System.out.println( res );
		
		String arr[] = res.split(" ");
		System.out.println( Arrays.toString(arr) );
		
		//if you need to change string frequently, you can use StringBuilder
		System.out.println("StringBuilder test");
		StringBuilder sb = new StringBuilder("hello wolrd");
		System.out.println( sb );
		sb.deleteCharAt(5);
		System.out.println( sb );
		sb.insert(0, "....");
		System.out.println( sb );
		
		
	}

}
