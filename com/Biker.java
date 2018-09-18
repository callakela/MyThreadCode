package com;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Biker implements Runnable {
	
	CyclicBarrier barrier;
	
	public Biker(CyclicBarrier barrier){
		
		this.barrier=barrier;
		
	}
	
	

	@Override
	public void run() {
		
       
        try {
        	 System.out.println(" all biker leaved from Mumbai");
			 barrier.await();
			 System.out.println(" all biker raech Common point one");
			 barrier.await();
			 System.out.println(" all biker raech Common point two");
			 barrier.await();
			 System.out.println(" all biker raech Mumbai");
		} catch (InterruptedException |  BrokenBarrierException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
        
	}

}
