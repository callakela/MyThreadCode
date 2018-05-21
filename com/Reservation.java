package com;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Reservation {
	
	Semaphore semaphore;
	
	Reservation(){
		semaphore = new Semaphore(1);
	}
	
	public void book(Object personalInfo) {
		
		try {
			semaphore.acquire();
			
			int duration = new Random().nextInt(100);
            System.out.printf("Time taken to book ticket for %s : %d\n",
                    Thread.currentThread().getName(), duration);
            Thread.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaphore.release();
		}
	}

}
