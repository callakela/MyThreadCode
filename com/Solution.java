package com;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);       
        int n = in.nextInt();

        int diognalleft = 0;
        int diognalright = 0;        
        int [][] array = new int[n][n];

        for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                   array[i][j]=in.nextInt();
             }
        } 
        for(int i=0; i<n; i++){
              for(int j=0; j<n; j++){
                  if (i == j)
                  {
                       diognalleft = diognalleft + array[i][j];
                  }
                  if( (i+j) == (n-1) )
                  {
                      diognalright = diognalright + array[i][j];
                  }
              }
         }
        System.out.println("Differance :"+Math.abs(diognalleft - diognalright));
    }
}