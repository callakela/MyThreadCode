package com;
public class CountDownLatchCustomTest {
    
    public static void main(String[] args) {
           CountDownLatchCustom countDownLatchCustom=new CountDownLatchCustom(3);
           System.out.println("CountDownLatch has been created with count=3");
           
           new Thread(new MyRunnableCountDownLatch(countDownLatchCustom),"Thread-1").start();
          new Thread(new MyRunnableCountDownLatch(countDownLatchCustom),"Thread-2").start();
           new Thread(new MyRunnableCountDownLatch(countDownLatchCustom),"Thread-3").start();
           
           try {
                  countDownLatchCustom.await();
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           
           System.out.println("count has reached zero, "+
                        Thread.currentThread().getName()+" thread has ended");
 
    }
 
}