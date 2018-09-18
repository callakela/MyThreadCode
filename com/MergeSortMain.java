package com;

public class MergeSortMain {
	
	static  int  arr[]={100,20,15,30,5,75,40};
	
	
	public static void printArray(int arr[],int start,int end)
	{
		for (int i = start; i <=end; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String args[])
	{
		// Print array before merge sort
		System.out.println("Array before sorting:");
		printArray(arr,0,arr.length-1);
		System.out.println("-----------------------------");
 
		mergeSort(0,arr.length-1);
 
		System.out.println("-----------------------------");
 
		// Print array after sorting
		System.out.println("Array After sorting:");
		printArray(arr,0,arr.length-1);
 
 
	}


	private static void mergeSort(int start, int end) {

      
		int mid=(start+end)/2;
		
		if(start< end){
		mergeSort(start,mid);
		mergeSort(mid+1,end);
		mergeArray(start,mid,end);
		}
		
	}


	private static void mergeArray(int start, int mid, int end) {
		
		int[] tempArray=new int[arr.length];
		
		int tempArrayIndex=start;
		
		int startIndex=start;
		int midIndex=mid+1;
		
		
		while(startIndex<=mid && midIndex<=end){
			
			if(arr[startIndex]< arr[midIndex])
			{
				tempArray[tempArrayIndex++]=arr[startIndex++];
			}
			else
			{
				tempArray[tempArrayIndex++]=arr[midIndex++];
			}
		}
		
		
		while(startIndex<=mid)
		{
			tempArray[tempArrayIndex++]=arr[startIndex++];
		}
		while(midIndex<=end)
		{
			tempArray[tempArrayIndex++]=arr[midIndex++];
		}
		
		for (int i = start; i <=end; i++) {
			arr[i]=tempArray[i];
		}
		
		System.out.print("After merging:   ");
		printArray(tempArray,start,end);
		System.out.println();
		
	}

}
