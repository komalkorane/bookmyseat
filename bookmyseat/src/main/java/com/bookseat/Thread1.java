package com.bookseat;

public class Thread1 extends Thread {

	SeatBook sb;
	int seats;
	public Thread1(SeatBook sb, int seats) {
		super();
		this.sb = sb;
		this.seats = seats;
	}
	public void run() {
    
		sb.bookshow(seats); 
		
	}
}
