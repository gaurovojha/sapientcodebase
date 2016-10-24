package practice.sapient.threads;

public class TwoThreadCommunication {

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
									x+=2;
									m.a = false;
									Thread.sleep(200);
									m.wait();
									m.notify();
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
						if (!m.a) {
								System.out.println(Thread.currentThread().getName() + "**||**" + x);
								
								x+=2;
								m.a = true;
								m.notify();
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

	}

}
