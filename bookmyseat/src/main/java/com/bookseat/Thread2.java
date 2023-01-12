package com.bookseat;

public class Thread2 extends Thread{
Thread2 t2;
	SeatBook sb;
	int seats;
	public Thread2(SeatBook sb, int seats) {
		super();
		this.sb = sb;
		this.seats = seats;
	}
	public void run()  {
//		try {
//			t2.wait();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		t2.notify();
		sb.bookshow(seats); 
		
	}
}
