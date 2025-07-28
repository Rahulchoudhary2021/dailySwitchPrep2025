package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class readWriteLock {
	private final ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
	
	public void readLock() {
		lock.readLock().lock();
		
		try {
			System.out.println(Thread.currentThread().getName()+" Reading file !!");
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}finally {
			lock.readLock().unlock();
		}
		
	}
	

}
