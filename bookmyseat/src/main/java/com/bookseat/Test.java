package com.bookseat;

public class Test {

	public static void main(String[] args) throws Exception {

		SeatBook sb=new SeatBook();
		Thread1 t1=new Thread1(sb,4);
		Thread1 t2=new Thread1(sb,7);
		
		t2.setName("Shree");
		t1.setName("Komal"); 
		
		t1.start(); 
		t2.start();
		System.out.println("Hiiii");
		
	}

}
