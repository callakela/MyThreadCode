package com;
public class ReentrantLockCustomTest {
   	public static void main(String[] args) {
 
      		LockCustom LockCustom=new ReentrantLockCustom();
      		MyRunnableReentrantLock myRunnable=new MyRunnableReentrantLock(LockCustom);
      		new Thread(myRunnable,"Thread-1").start();
      		new Thread(myRunnable,"Thread-2").start();
      		
   	}
}