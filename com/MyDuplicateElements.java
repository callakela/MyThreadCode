package com;

import java.util.HashSet;
import java.util.Set;

public class MyDuplicateElements {
	
	
	public static int[] removeDuplicates(int[] array) {
		
		Set<Integer> duplicate =new HashSet<>();
		
		int i=1;
		int j=0;
		if(array==null ||array.length<2 ) {
			return array;
		}
		
		while(i<array.length) {
			
			if(array[i]==array[j]) {
				duplicate.add(array[j]);
				i++;
			}else {
				
				array[++j]=array[i++];
			}
		}
		
		int[] output = new int[j++];
		
		for (int k = 0; k < output.length; k++) {
			output[k]=array[k];
		}
		duplicate.forEach(System.out::println);
		return output;
	}
	
	
	public static void main(String a[]){
		int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
		int[] output = removeDuplicates(input1);
		for(int i:output){
			System.out.print(i+" ");
		}
	}

}
