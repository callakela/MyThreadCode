package com;

import java.util.LinkedList;
import java.util.Random;

public class DataStore {
	
	 public int storeSize;
	 public LinkedList<Integer> store;
	 Random random = new Random(1000);
	 
	 DataStore(int storeSize){
		 this.storeSize=storeSize;
		 store= new LinkedList<>();
	 }
	 
	 public synchronized void put() {

	        if(store.size() == storeSize) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        int putValue = random.nextInt(1000);
	        store.offer(putValue);
	        System.out.printf("Putting : Value = %d\n", putValue);
	        notifyAll();
	    }

	 public synchronized void get() {

	        if(store.size() == 0 ){
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        int value = store.poll();
	        System.out.printf("Getting Value : %d \n",value);
	        notifyAll();
	    }
}
