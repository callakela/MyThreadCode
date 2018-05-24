package com;

import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
	
	private int numOfThread;
	
	private PoolWorker [] workerThread;
	private LinkedBlockingQueue queue;
	
	public ThreadPool(int numOfThread){
		
		   this.numOfThread=numOfThread;
		    queue = new LinkedBlockingQueue<>();
	     	workerThread=new PoolWorker[numOfThread];
		
	     for (int i = 0; i < numOfThread; i++) {
		 
		   workerThread[i] = new PoolWorker(queue);
		 
		   workerThread[i].start();
		 
	}
	 
}
	
	public void executeTask(Runnable task) {
		
		synchronized (queue) {
			queue.add(task);
			queue.notify();
		}
	}
	
	

}
