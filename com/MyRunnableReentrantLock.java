package com;

public class MyRunnableReentrantLock  implements Runnable{
	
	LockCustom lockCustom;
   	public MyRunnableReentrantLock(LockCustom LockCustom) {  	
      		this.lockCustom=LockCustom;
   	}
   	
   	public void run(){
      		
      		System.out.println(Thread.currentThread().getName()
                   		+" is Waiting to acquire LockCustom");
      		
      		lockCustom.lock();
 
      		System.out.println(Thread.currentThread().getName()
                   		+" has acquired LockCustom.");
      		
      		try {
             		Thread.sleep(5000);
             		System.out.println(Thread.currentThread().getName()
                          		+" is sleeping.");
      		} catch (InterruptedException e) {
             		e.printStackTrace();
      		}
 
      		System.out.println(Thread.currentThread().getName()
                   		+" has released LockCustom.");
      		
      		
      		lockCustom.unlock();
   	}

}
