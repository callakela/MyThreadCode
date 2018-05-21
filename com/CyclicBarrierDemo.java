package com;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
	
	public static void main(String...strings ) {
		
		final CyclicBarrier checkpoint= new CyclicBarrier(4,new Runnable() {
			
			@Override
			public void run() {
				System.out.println("======All reached at check point==========");
				
			}
		});
		
		Thread thd1=new Thread(new Biker(checkpoint),"Thread1");
		Thread thd2=new Thread(new Biker(checkpoint),"Thread2");
		Thread thd3=new Thread(new Biker(checkpoint),"Thread3");
		Thread thd4=new Thread(new Biker(checkpoint),"Thread4");
		
		thd1.start();
		thd2.start();
		thd3.start();
		thd4.start();
	}

}
