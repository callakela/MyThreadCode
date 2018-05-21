package com;

public class TestFinalize
{
   public static void main(String[] args)
   {
	  

	  A a1 = new A(10);

	   a1 = new A(20);

	 
       System.gc();   

	  System.out.println("done");
   }
}