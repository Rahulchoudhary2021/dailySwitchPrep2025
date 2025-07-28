package MultiThreading;

public class waysOfCreation extends Thread {
	public void run() {
		System.out.println("Thread running");
	}

	public static void main(String args[]) {
		waysOfCreation thread=new waysOfCreation();
		thread.start();
		
	}
}

