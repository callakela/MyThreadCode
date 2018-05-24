package com;

public class Bus implements Runnable{

	
	@Override
	public void run() {
				
			System.out.println(Thread.currentThread().getName() +" Bus has reached at dastination");
			
	}
	
public static void main(String... args) {
	    Bus bus=new Bus();
		Thread t1= new Thread(bus, "B1");
		Thread t2= new Thread(bus, "B2");
		Thread t3= new Thread(bus, "B3");
		Thread t4= new Thread(bus, "B4");
		Thread t5= new Thread(bus, "B5");
		
	
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
			t3.join();
			t4.start();
			t4.join();
			t5.start();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println(t4.isAlive());
		System.out.println(t5.isAlive());
	}


}
