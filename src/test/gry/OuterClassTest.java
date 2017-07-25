package test.gry;

public class OuterClassTest {
	private int size;
	
	public class InnerClass {
		private int cnt = 10;
		public void doStuff()
		{
			size++;
		}
	}
	
	public static void main(String[] args) {
		OuterClassTest outerClass = new OuterClassTest();
		InnerClass innerClass = outerClass.new InnerClass();
		innerClass.doStuff();
		System.out.println(outerClass.size);
        System.out.println(innerClass.cnt);
	}

}
