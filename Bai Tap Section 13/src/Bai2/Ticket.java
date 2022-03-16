package Bai2;

public class Ticket implements Runnable {
	private int ve = 2;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		muaVe();
	}
//lock
	public synchronized void muaVe() {
		ve -= 1;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (ve > 0) {
			System.out.println(Thread.currentThread().getName() + "con" + ve + "ve");
		} else {
			System.out.println(Thread.currentThread().getName() + " da het ve");
		}
	}
}
