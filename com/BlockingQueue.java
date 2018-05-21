package com;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class BlockingQueue {
	
	Object object= new Object();
	
	ArrayBlockingQueue<String> queue = new ArrayBlockingQueue(1024);
	LinkedBlockingQueue<String> linkedQue   = new LinkedBlockingQueue<String>(1024);
	PriorityBlockingQueue<String> priorityQueue   = new PriorityBlockingQueue();
	SynchronousQueue<String> synchQue=new SynchronousQueue();
	
	BlockingQueue(){
		Thread t1=  new Thread(new Runnable() {
			
			public void run() {
				
				synchronized (object) {
					
					try {
						System.out.println("Adding elememnt in ArrayBlockingQueue");
						queue.put("amit");
						System.out.println("Adding elememnt in LinkedBlockingQueue");
						linkedQue.put("akela");
						System.out.println("Adding elememnt in PriorityBlockingQueue");
						priorityQueue.put("Hello");
						//System.out.println("Adding elememnt in SynchronousQueue");
						//synchQue.put("synchQue");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		 Thread t2=  new Thread(new Runnable() {
				
				public void run() {
					
					synchronized (object) {
						
						try {
							System.out.println("Getting elememnt from ArrayBlockingQueue");
							System.out.println("ArrayBlockingQueue : "+queue.take());
							System.out.println("Getting elememnt from ArrayBlockingQueue");
							System.out.println("ArrayBlockingQueue : "+linkedQue.take());
							System.out.println("Getting elememnt from PriorityBlockingQueue");
							System.out.println("ArrayBlockingQueue : "+priorityQueue.take());
							//System.out.println("Getting elememnt from SynchronousQueue");
							//System.out.println("ArrayBlockingQueue : "+synchQue.take());
							
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					
				}
			});
		 
		 t1.start();
		 t2.start();
		
	}
	
	
	
  
	
   public static void main(String... args){
	   
	   new BlockingQueue();
   }
	

}
