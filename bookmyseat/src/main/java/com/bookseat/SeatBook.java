package com.bookseat;

public class SeatBook {

	int totalseats=10;
	
	public void bookshow(int seats) {
		System.out.println("Welcome !!");
		
		System.out.println("Total Seats Are "+totalseats);
		synchronized (" hii ") {if(totalseats>=seats) {
			System.out.println(Thread.currentThread().getName()+" " +seats+" "+"Seats book successfully !!");
			totalseats=totalseats-seats;
			System.out.println("Available Seats are "+totalseats);
			  
		}
		else { 
			System.out.println(Thread.currentThread().getName()+" "+ seats+"  "+"Seats not available !");
		}
	}
		System.out.println("Do visit again !!");
		}
}
