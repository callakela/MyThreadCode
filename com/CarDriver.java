package com;

import java.util.concurrent.CountDownLatch;

public class CarDriver {

	 public static void main(String args[]) {
		 
		 CountDownLatch latch = new CountDownLatch(4);
		 
		 Employee emp1= new Employee("emp1", 1000, latch);
		 Employee emp2= new Employee("emp2", 1000, latch);
		 Employee emp3= new Employee("emp3", 1000, latch);
		 Employee emp4= new Employee("emp4", 1000, latch);
		 
		 Thread tdh1= new Thread(emp1);
		 Thread tdh2= new Thread(emp2);
		 Thread tdh3= new Thread(emp3);
		 Thread tdh4= new Thread(emp4);
		 tdh1.start();
		 tdh2.start();
		 tdh3.start();
		 tdh4.start();
		 
		 try
	      {
	            // carDriver thread is waiting on CountDownLatch to finish
	            latch.await();  
	            System.out.println("All employees have taken their seat, Driver started the car");
	       }
	       catch(InterruptedException ie){
	           ie.printStackTrace();
	       }
	       
	    }
		 
	 
}
