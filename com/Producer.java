package com;
class Producer implements Runnable{
    
    SemaphoreCustom semaphoreProducer;
    SemaphoreCustom semaphoreConsumer;
    
    
    public Producer(SemaphoreCustom semaphoreProducer,SemaphoreCustom semaphoreConsumer) {
           this.semaphoreProducer=semaphoreProducer;
           this.semaphoreConsumer=semaphoreConsumer;
    }
 
    public void run() {
           for(int i=1;i<=5;i++){
                  try {
                        semaphoreProducer.acquire();
                        System.out.println("Produced : "+i);
                        semaphoreConsumer.release();
                        
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
           }          
    }
}