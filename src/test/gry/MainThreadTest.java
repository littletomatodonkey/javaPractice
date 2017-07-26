package test.gry;

public class MainThreadTest {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		
		System.out.println("original thread");
		System.out.println( thread );
		
		thread.setName("modified thread");
		
		System.out.println("modified thread");
		System.out.println( thread );
		
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println( i );
				Thread.sleep(1000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("thread has been interrupted...");
		}
		
		
	}

}
