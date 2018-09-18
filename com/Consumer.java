package com;
class Consumer implements Runnable{
 
    SemaphoreCustom semaphoreConsumer;
    SemaphoreCustom semaphoreProducer;
    
    public Consumer(SemaphoreCustom semaphoreConsumer,SemaphoreCustom semaphoreProducer) {
           this.semaphoreConsumer=semaphoreConsumer;
           this.semaphoreProducer=semaphoreProducer;
    }
 
    public void run() {
           
           for(int i=1;i<=5;i++){
                  try {
                        semaphoreConsumer.acquire();
                        System.out.println("Consumed : "+i);
                        semaphoreProducer.release();
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
           }
    }
    
}