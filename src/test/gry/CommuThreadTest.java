package test.gry;

public class CommuThreadTest {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");
	}

}

class Q {
	int n;
	boolean valSet = false;
	synchronized int get()
	{
		if( !valSet )
		{
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Got: " + n);
		valSet = false;
		notify();
		return n;
	}
	
	synchronized void put( int n )
	{	
		if( valSet )
		{
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		this.n = n;
		valSet = true;
		System.out.println("Put : " + n);
		notify();
	}
}

class Producer implements Runnable {
	Q q;
	public Producer(Q q) {
		this.q = q;
		new Thread( this, "Producer" ).start();
	}
	@Override
	public void run() {
		int i = 0;
		while( i++ < 20 )
		{
			q.put(i);
		}
	}
}

class Consumer implements Runnable {
	Q q;
	public Consumer(Q q) {
		this.q = q;
		new Thread( this, "Consumer" ).start();
	}
	@Override
	public void run() {
		while(true)
		{
			q.get();
		}
	}
}




