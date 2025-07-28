package MultiThreading;

class foodFactory {
	private boolean isAvailable = false;
	private int data;

	synchronized public void producer(int rowData) throws InterruptedException {
		while (isAvailable) {
			wait();
		}
		data = rowData;
		System.out.println(Thread.currentThread().getName() + " produce " + data);
		Thread.sleep(1000);
		isAvailable = true;
		notify();
	}

	synchronized public void consumer(int rowData) throws InterruptedException {
		while (!isAvailable) {
			wait();
		}
		data = rowData;
		System.out.println(Thread.currentThread().getName() + " consume " + data);
		Thread.sleep(1000);
		isAvailable = false;
		notify();
	}

}

public class ProducerConsumerDemo {
	public static void main(String args[]) {
		foodFactory food = new foodFactory();

		// Producer call

		Thread thread1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					food.producer(i);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}, "Producer");

		// consumer call

		Thread thread2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					food.consumer(i);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}, "Consumer");

		thread1.start();
		thread2.start();

	}
}
