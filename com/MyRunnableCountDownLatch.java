package com;

public class MyRunnableCountDownLatch implements Runnable {
	
		    
	    CountDownLatchCustom countDownLatchCustom;
	    
	    MyRunnableCountDownLatch(CountDownLatchCustom countDownLatchCustom){
	           this.countDownLatchCustom=countDownLatchCustom;
	    }
	    
	    public void run(){
	           
	          
	                  
	                  countDownLatchCustom.countDown();            
	                  System.out.println(Thread.currentThread().getName()+
	                               " has reduced latch count to : ");
	                  
	                  try {
	                        Thread.sleep(1000);
	                  } catch (InterruptedException e) {
	                        e.printStackTrace();
	                  }
	         
	                  
	    }
	    
	

}
