package practice.sapient.threads;

public class ThreadCommunicationAlternateNoEx {

	public static void main(String[] args) {
		
		/*Map m = new HashMap();
		System.out.println(m.put("gaurov", "ojha"));
		System.out.println(m.put("gaurov", "sharma"));
		
		
		Set s = new HashSet();
		System.out.println(s.add("gaurov"));
		System.out.println(s.add("gaurov"));*/
		
		Object obj = new Object();
		
		Thread t1 = new Thread(new Task1(obj), "thread1");
		Thread t2 = new Thread(new Task2(obj), "thread2");
		
		
		
		t1.start();
		t2.start();
	}

}

class Task1 implements Runnable{
	Object obj ;
	
	public Task1(Object o){
		obj = o ;
	}
	
	public void run(){
		State.initialized = true ; 
		if(State.initialized){
			work();
		}
	}
	
	public void work(){
		for(int i =1 ; i<=19 ;i=i+2){
			synchronized(obj){
				System.out.println(Thread.currentThread().getName() + ":" + i);
				try {
					obj.wait();
					obj.notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class Task2 implements Runnable{
	Object obj ;
	
	public Task2(Object o){
		obj = o ;
	}
	
	public void run(){
		if(State.initialized){
			work();
		}
	}
	
	public void work(){
		for(int i =2 ; i<=20 ;i=i+2){
			synchronized (obj) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				obj.notify();
				try {
					//Thread.sleep(20000);
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class State{
	public static boolean initialized = false;
}
