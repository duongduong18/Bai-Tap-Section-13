package Bai2;

public class MainVe {
//duy nhat 1 doi tuong ticket nhung hai ham thread truy xuat
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket Ticket = new Ticket();

		Thread t1 = new Thread(Ticket);
		Thread t2 = new Thread(Ticket);
		Thread t3 = new Thread(Ticket);
		t1.setName("nguoi 1");
		t2.setName("nguoi 2");
		t3.setName("nguoi 3");
		t1.start();
		t2.start();
		t3.start();
	}
}