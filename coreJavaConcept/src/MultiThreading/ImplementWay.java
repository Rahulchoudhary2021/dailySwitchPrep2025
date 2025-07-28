package MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ImplementWay {

	public static void main(String args[]) {
//		ExecutorService thread = Executors.newFixedThreadPool(3);
//
//		Runnable task1 = () -> System.out.println("DOne with task 1 " + Thread.currentThread().getName());
//		Runnable task2 = () -> System.out.println("DOne with task 2 " + Thread.currentThread().getName());
//
//		thread.submit(task1);
//		thread.submit(task2);
		
		ScheduledExecutorService scheduledThread=Executors.newScheduledThreadPool(3);
//		Runnable task1 = () -> System.out.println("DOne with task 1 " + Thread.currentThread().getName());
//		Runnable task2 = () -> System.out.println("DOne with task 2 " + Thread.currentThread().getName());
//		scheduledThread.schedule(task1, 5, TimeUnit.SECONDS);
//		scheduledThread.schedule(task2, 15, TimeUnit.SECONDS);
//		scheduledThread.shutdown();
//		
		
		Callable<String> call =
				()-> {return "Done with task 1 ";
				};
				
		ScheduledFuture<String> future=scheduledThread.schedule(call, 5, TimeUnit.SECONDS);	
		
		try {
			System.out.println(future.get());  
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	}


