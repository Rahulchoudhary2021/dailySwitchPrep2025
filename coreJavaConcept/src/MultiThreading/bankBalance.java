package MultiThreading;

public class bankBalance extends Thread {
	int userBalance = 1000;

	public synchronized void withdrawal(int amount) {
		if (amount <= userBalance) {
			System.out.println("Name : " + Thread.currentThread().getName() + "Processing payment !!");
			userBalance -= amount;
			System.out.println(amount+" amount debit from your saving account");
			try {
				Thread.sleep(1000);
				System.out.println(userBalance+" amount left in your saving account !!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {

		}
	}

}
