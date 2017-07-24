package test.gry;

public class classDog {
	
	int age;
	String name;
	
	public classDog(int a, String n)
	{
		age = a;
		name = n;
		printInfo();
	}
	
	private void printInfo()
	{
		System.out.println( this.toString()  );
	}
	
	@Override
	public String toString()
	{
		return "my name is " + name + ", my age is " + age ;
	}

	public static void main(String[] args) {
		classDog d = new classDog(1, "xm");
		
	}

}
