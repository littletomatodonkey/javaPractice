package test.gry;

public class PriorityThreadTest {

	public static void main(String[] args) {
		ClickThread t1 = new ClickThread( Thread.NORM_PRIORITY - 4 );
		ClickThread t2 = new ClickThread( Thread.NORM_PRIORITY + 4 );
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		t1.stop();
		t2.stop();
		
		try {
			t1.thread.join();
			t2.thread.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Low-priority thread: " + t1.click);
	    System.out.println("High-priority thread: " + t2.click);
	}

}

class ClickThread implements Runnable {

	long click = 0;
	Thread thread;
	volatile boolean running = false;
	
	public ClickThread(int p) {
		thread = new Thread(this);
		thread.setPriority(p);
	}
	
	@Override
	public void run() {
		while( running )
		{
			click++;
		}
	}
	
	public void stop() {
		running =false;
	}
	
	public void start() {
		running = true;
		thread.start();
	}
}
