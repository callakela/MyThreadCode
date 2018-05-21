package com;

import java.util.stream.IntStream;

public class MissingNumber {
	
	static int getMissingNo (int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;   
        for ( i = 0; i< n; i++)
           total -= a[i];
        return total;
    }
      
    
    public static void main(String args[])
    {
        int a[] = IntStream.range(1, 100).toArray();
        int miss = getMissingNo(a,a.length);
        System.out.println(miss);   
    }

}
