package threads;

import java.util.Queue;

public class SingleProducerConsumerProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Producer implements Runnable{

	MyQueue q ;
	
	public Producer(MyQueue q) {
		this.q = q ;
	}
	
	public void run() {
		while(true){
			if(q.queue.size()==10){
				notify();
				try {
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				System.out.println("consuming " + "" + q.queue.add("task"));
			}
		}
	}
	
}


class Consumer implements Runnable{

	MyQueue q ;
	
	public Consumer(MyQueue q) {
		this.q = q ;
	}
	
	public void run() {
		while(true){
			if(q.queue.size()==0){
				try {
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else{
				System.out.println("consuming " + "" + q.queue.poll());
			}
		}
	}
	
}

class MyQueue{
	public static Queue<String> queue ;
}