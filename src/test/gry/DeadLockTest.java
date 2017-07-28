package test.gry;

class DeadA {
    synchronized void foo(DeadB b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered DeadA.foo");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("DeadA Interrupted");
        }
        System.out.println(name + " trying to call DeadB.last()");
        b.last();
    }
    synchronized void last() {
        System.out.println("Inside DeadA.last");
    }
}
class DeadB {
    synchronized void bar(DeadA a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered DeadB.bar");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("DeadB Interrupted");
        }
        System.out.println(name + " trying to call DeadA.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("Inside DeadA.last");
    }
}

public class DeadLockTest implements Runnable {
	DeadA a = new DeadA();
	DeadB b = new DeadB();
	
	public DeadLockTest() {
		Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        a.foo(b); // get lock on a in this thread.
        System.out.println("Back in main thread");
	}

	public static void main(String[] args) {
		new DeadLockTest();
	}

	@Override
	public void run() {
		b.bar(a); // get lock on b in other thread.
		System.out.println("Back in other thread");
	}
}



