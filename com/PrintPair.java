package com;

import java.util.HashSet;
import java.util.Set;

public class PrintPair {
	
	 public static void main(String args[])
	    {
	       // int[] arr = { 1, 5, 7, -1, 5 };
		   int[] arr= {4, 6, 5, -10, 8, 5, 20};
	        int sum = 10;
	        Set<Pair> result= getPairsCount(arr, sum);
	        
	        //result.forEach(obj->System.out.println("pair is "+obj.getNumberOne()+" : "+obj.getNumberTwo()));
	        
	    }
	 
	   
	    public static Set<Pair> getPairsCount(int[] arr, int sum)
	    {
	    	Set<Pair> pairNumSet= new HashSet<>();
	    	
	        int count = 0;// Initialize result
	 
	        
	        for (int i = 0; i < arr.length; i++)
	            for (int j = i + 1; j < arr.length; j++)
	                if ((arr[i] + arr[j]) == sum) {
	                	Pair pair=new Pair(arr[i],arr[j]);
	                	pairNumSet.add(pair);
	                	count++;
	                			
	                }
	                    
	        
	        System.out.println("Count of pairs is : "+count);
	        
	        return pairNumSet;
	    }

}
