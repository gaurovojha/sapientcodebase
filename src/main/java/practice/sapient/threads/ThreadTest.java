package threads;

import java.util.concurrent.Callable;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callable c = () -> "Hello";
		Runnable r = ()->System.out.println("Hello");;
		Thread t1 = new Thread(r);
		//t1.
		t1.start();
		
		Object obj = new Object();
	}

}
