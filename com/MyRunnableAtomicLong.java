package com;

public class MyRunnableAtomicLong implements Runnable{
	
	public void run(){
        for(int i=0;i<2;i++){
               System.out.println("ThreadName="+Thread.currentThread().getName()
                            +" > "+
                    AtomicLongCustomTest.sharedAtomicLongCustomCustom.incrementAndGet());
        }          
        
 }

}
