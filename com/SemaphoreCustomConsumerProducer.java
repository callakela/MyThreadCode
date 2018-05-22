package com;
public class SemaphoreCustomConsumerProducer{
    
    public static void main(String[] args) {
 
           SemaphoreCustom semaphoreProducer=new SemaphoreCustom(1);
           SemaphoreCustom semaphoreConsumer=new SemaphoreCustom(0);
           System.out.println("semaphoreProducer permit=1 | semaphoreConsumer permit=0");
           
       Producer producer=new Producer(semaphoreProducer,semaphoreConsumer);
       Consumer consumer=new Consumer(semaphoreConsumer,semaphoreProducer);
      
        Thread producerThread = new Thread(producer, "ProducerThread");
        Thread consumerThread = new Thread(consumer, "ConsumerThread");
 
        producerThread.start();
        consumerThread.start();
 
    }
}