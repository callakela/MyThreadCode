package com;

public class MyRunnableAtomicInteger implements Runnable {

	@Override
	public void run(){
      	for(int i=0;i<2;i++){
             	System.out.println("ThreadName="+Thread.currentThread().getName()
                          	+" > "+
      	AtomicIntegerCustomExample.sharedAtomicIntegerCustom.incrementAndGet());
      	}         	
      	
	}

}
