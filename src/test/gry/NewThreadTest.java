package test.gry;

public class NewThreadTest {

	public static void main(String[] args) {
		RunnableThread t1 = new RunnableThread();
		ExtendThread t2 =  new ExtendThread();
		 
		try {
			System.out.println("Waiting for threads to finish.");
			t1.t.join();
			t2.join();
		} catch (Exception e) {
			System.out.println( e.toString() );
		}
		// if not add the try-catch as above, it will output the following firstly.
		System.out.println("exiting main thread...");
		
	}

}

// runnable thread
class RunnableThread implements Runnable {

	Thread t;
	public RunnableThread() {
		t= new Thread(this, "demo thread");
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println( "runnable child thread : " + i );
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("runnable child thread exited");
		}
	}
	
}

// extend Thread
class ExtendThread extends Thread {
	public ExtendThread() {
		super( "Demo Thread" );
		System.out.println("extend child thread : " + this);
		start();
	}
	
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println( "extend child thread : " + i );
				Thread.sleep(800);
			}
		} catch (InterruptedException e) {
			System.out.println("extend child thread exited");
		}
	}
}





