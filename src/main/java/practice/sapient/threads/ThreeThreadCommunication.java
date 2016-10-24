package practice.sapient.threads;

public class ThreeThreadCommunication {

	public static void main(String[] args) {

		Mutex m = new Mutex();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				int x = 1;
				while (true) {
					synchronized (m) {
						if (m.a) {
								System.out.println(Thread.currentThread().getName() + "**||**" + x);
								try {
									x+=4;
									m.a = false;
									m.b = true;
									Thread.sleep(200);
									m.wait();
									m.notifyAll();
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
						}
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				int x = 2;
				while (true) {
					synchronized (m) {
						if (m.b) {
								System.out.println(Thread.currentThread().getName() + "**||**" + x);
								
								x+=4;
								m.b= false;
								m.c = true;
								m.notifyAll();
								try {
									m.wait();
									Thread.sleep(200);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						}
					}
				}
			}
		});
		
		
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				int x = 3;
				while (true) {
					synchronized (m) {
						if (m.c) {
								System.out.println(Thread.currentThread().getName() + "**||**" + x);
								
								x+=4;
								m.c = false;
								m.d = true;
								m.notifyAll();
								try {
									m.wait();
									Thread.sleep(200);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						}
					}
				}
			}
		});
		
		
		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				int x = 4;
				while (true) {
					synchronized (m) {
						if (m.d) {
								System.out.println(Thread.currentThread().getName() + "**||**" + x);
								
								x+=4;
								m.d = false;
								m.a = true;
								m.notifyAll();
								try {
									m.wait();
									Thread.sleep(200);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						}
					}
				}
			}
		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
