package com;

import java.util.concurrent.CountDownLatch;

class Employee implements Runnable{
    private final String name;
    private final int timeToReachParking;
    private final CountDownLatch latch;
   
    public Employee(String name, int timeToReachParking, CountDownLatch latch){
        this.name = name;
        this.timeToReachParking = timeToReachParking;
        this.latch = latch;
    }
   
    @Override
    public void run() {
        try {
            Thread.sleep(timeToReachParking);
        } catch (InterruptedException ex) {
        	System.err.println("Error : ");
        	ex.printStackTrace();
        }
        System.out.println( name + " has taken his seat");
        latch.countDown(); //reduce count of CountDownLatch by 1
    }
   
}