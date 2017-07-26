package test.gry;

public class SynchThreadTest {

	public static void main(String[] args) {
		CallMe t = new CallMe();
		Caller obj1 = new Caller(t, "one");
		Caller obj2 = new Caller(t, "two");
		Caller obj3 = new Caller(t, "three");
		
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}

}

class CallMe {
	// call func can not be reached before it was used by others
	synchronized void call(String msg)
	{
		System.out.print( "[" + msg );
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println( "]" );
	}
}

class Caller implements Runnable {

	String msg;
	CallMe target;
	Thread t;
	
	public Caller( CallMe c, String s ) {
		target = c;
		msg = s;
		t= new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		target.call(msg);
	}
}