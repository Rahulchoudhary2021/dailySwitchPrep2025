package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

class incementValue {
//	public int count = 0;

//	public synchronized Integer valueIncre() {
//		return count++;
//	}
	AtomicInteger count= new AtomicInteger(0);
	public Integer valueIncre() {
		return count.getAndIncrement();
	}
	
}

public class volatileAtomic {

	public static void main(String args[]) {
		incementValue incre = new incementValue();
		Runnable thread1 = () -> {

			for (int i = 0; i <= 50000; i++) {
				incre.valueIncre();
			}

		};
		Runnable thread2 = () -> {
			for (int i = 0; i <= 50000; i++) {
				incre.valueIncre();
			}
		};

		Thread threadOne = new Thread(thread1);
		threadOne.start();
		Thread threadTwo = new Thread(thread2);
		threadTwo.start();
		try {
			threadOne.join();
			threadTwo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Value = " + incre.count);

	}

}
