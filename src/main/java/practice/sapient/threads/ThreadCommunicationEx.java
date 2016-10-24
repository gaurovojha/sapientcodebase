package practice.sapient.threads;

public class ThreadCommunicationEx {
	//static int sum = 0;
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("start");
		Data d = new Data();
		d.sum = 0;
		Task task = new Task(d);
		Thread t1 = new Thread(task,"myThread");

		t1.start();
		
		
		//first way to wait for Thread T1 to complete
		//t1.join();
		
		//Second way to wait for Thread T1 to complete
		//Thread.currentThread().sleep(20000);
		synchronized(d){
			d.wait();
		}
		
		//System.out.println(Data.sum);
		System.out.println("end");
	}

}

class Task implements Runnable{
	
	private Data data;
	public Task(Data d){
		data = d;
	}
	public void run(){
		
		for(int i =0 ;i <1000 ;i ++){
			data.sum=data.sum +i ;
		}
		System.out.println(data.sum);
		synchronized (data) {
			data.notify();
		}
	}
}

class Data{
	int sum;
}
