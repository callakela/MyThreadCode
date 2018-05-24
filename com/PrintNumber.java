package com;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintNumber implements Runnable{
	
	AtomicInteger numberOne=new AtomicInteger(1);
	AtomicInteger numberTwo=new AtomicInteger(11);
	int limit=10;

	@Override
	public void run() {
		
		if(Thread.currentThread().getName().equalsIgnoreCase("ThreadOne")) {
			
		   Printer.printNumber(numberOne,limit);
		   
		}
		
		if(Thread.currentThread().getName().equalsIgnoreCase("ThreadTwo")) {
			
		   Printer.printNumber(numberTwo,limit);
		}
		
	}
	
	
	public static void main(String... args) {
		
		Thread t1= new Thread(new PrintNumber(), "ThreadOne");
		Thread t2= new Thread(new PrintNumber(), "ThreadTwo");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}

}
