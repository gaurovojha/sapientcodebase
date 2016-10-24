package practice.sapient.threads;

public class ThreadCommunicationThreeThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mutex1 m = new Mutex1();
		
		Thread t1 = new Thread(new TaskA(m), "thread1");
		Thread t2 = new Thread(new TaskB(m), "thread2");
		Thread t3 = new Thread(new TaskC(m), "thread3");
		
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}


class TaskA implements Runnable{
	Mutex1 m;
	
	public TaskA(Mutex1 m){
		this.m = m ;
	}
	
	public void run(){
		for(int i =1 ; i<=20 ;i=i+3){
			synchronized(m){
				System.out.println(Thread.currentThread().getName() + ":" + i);
				try {
					m.wait();
					m.notifyAll();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class TaskB implements Runnable{
	Mutex1 m;
	
	public TaskB(Mutex1 m){
		this.m = m ;
	}
	
	public void run(){
		for(int i =2 ; i<=19 ;i=i+3){
			synchronized (m) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				
				try {
					//Thread.sleep(20000);
					m.wait();
					m.notifyAll();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class TaskC implements Runnable{
	Mutex1 m ;
	
	public TaskC(Mutex1 m ){
		this.m = m ;
	}
	
	public void run(){
		for(int i =3 ; i<=18 ;i=i+3){
			synchronized (m) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				m.notifyAll();
				try {
					//Thread.sleep(20000);
					m.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class Mutex1{
	public boolean a,b,c  = false ;
}