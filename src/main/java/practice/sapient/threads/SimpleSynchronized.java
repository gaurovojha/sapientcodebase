package practice.sapient.threads;

public class SimpleSynchronized {

	public static void main(String[] args) {
		TestA test = new TestA();
		YoungWorker worker = new YoungWorker(test);
		Thread t1 = new Thread(worker);
		Thread t2 = new Thread(worker);
		
		t1.start();
		t2.start();
	}

}

class YoungWorker implements Runnable{
	TestA test ;
	public YoungWorker(TestA test){
		this.test = test;
	}
	
	@Override
	public void run() {
		test.m1();
	}
	
}


class TestA{
	public synchronized void m1(){
		System.out.println(Thread.currentThread().getName() + "inside A --- Calling m1 ");
	}
}