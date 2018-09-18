package com;


public class JavaProgramExp1 {
	
	public static void main(String[] args){
		 int fact=1;
		java.util.Scanner ssc= new java.util.Scanner(System.in);
		
		System.out.println("Enter an number :");
		
		int number =ssc.nextInt();
		System.out.println("Enter an number is "+number);
		covertToHexa(number);
		for (int i = number; i >0; i--) {
			fact=fact*i;
			
		}
		
		System.out.println("fact of  "+number+" is "+fact);
	}
	
	public static String covertToHexa(int decnum){
		
		char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int hexbase=16,rem;
		StringBuilder hexNum= new StringBuilder();
		
		
		while(decnum!=0){
			rem=decnum%hexbase;
			hexNum.append(hex[rem]);
			
			decnum=decnum/16;
		}
		
		if(null!=hexNum){
			
			String hexnumber=hexNum.reverse().toString();
			System.out.println("hexnumber number for decnum"+decnum+" is "+hexnumber);
			return hexnumber;
		}
		
		return "";
	}
	
	public static boolean isAnagram(String str1,String str2){
		
		if(null!=str1 && null!=str2){
			if(str1.length() == str2.length()){
				char[] chArry1=str1.toCharArray();
				char [] chArry=str2.toCharArray();
				
			}
		}
		
		return false;
	}

}
