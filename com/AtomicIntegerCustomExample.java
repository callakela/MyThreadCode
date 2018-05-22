package com;
public class AtomicIntegerCustomExample {
   	
   	//Create a new AtomicIntegerCustom and is initialized with 0.
   	static AtomicIntegerCustom sharedAtomicIntegerCustom =new AtomicIntegerCustom();
   	
   	public static void main(String...args) throws InterruptedException{
   		MyRunnableAtomicInteger runnable=new MyRunnableAtomicInteger();
          	Thread thread1=new Thread(runnable,"Thread-1");
          	Thread thread2=new Thread(runnable,"Thread-2");
          	thread1.start();
          	thread2.start();
          	
          	Thread.sleep(1000); //delay to ensure Thread-1 and Thread-2 finish
          	System.out.println("After completion of both threads, "
                       	+ "sharedAtomicIntegerCustom = "+sharedAtomicIntegerCustom);
   	}
}