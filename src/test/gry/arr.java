package test.gry;

public class arr {
	public static void main(String[] args)
	{
		int a[] = {1, 2, 3, 5, 8};
		
		System.out.println("general array out...");
		for(int i=0;i<a.length;i++)
		{
			System.out.println( a[i] + ", " );
		}
		
		System.out.println("enhanced print out...");
		for(int i : a)
		{
			System.out.print( i + ", " );
		}
		
	}
}
