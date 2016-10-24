package practice.sapient.threads;

public class DeadlockWithWaitNotify {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		String resource1 = "resource1";
		String resource2 = "resource2";

		Worker w = new Worker(a, b);
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				while (true) {
					synchronized (resource1) {
						synchronized (resource2) {
							System.out.println("System is running fine");
						}
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				while (true) {
					synchronized (resource2) {
						synchronized (resource1) {
							System.out.println("System is running fine");
						}
					}
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}

class Worker implements Runnable {
	private A a;
	private B b;

	public Worker(A a, B b) {
		this.a = a;
		this.b = b;
	}

	public void run() {

		a.callMe();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		b.callMe();
	}
}

class A {

	public synchronized void callMe() {
		System.out.println("calling callme of A");
	}

}

class B {

	public synchronized void callMe() {
		System.out.println("calling callme of B");
	}

}
