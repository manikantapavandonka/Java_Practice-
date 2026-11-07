package com.Arrays;

public class Example2 {

	public static void main(String[] args) {
     int [] numbers;
     numbers = new int[5];
     numbers[0] = 10;
     numbers[1] = 20;
     numbers[2] = 30;
     numbers[3] = 40;
     numbers[4] = 50;
//     reverse printing the array
     for(int i =numbers.length-1; i>=0; i--) {
    	 System.out.println(numbers[i]);
     }
//     printing an array
      for(int i = 0; i<numbers.length;i++) {
    	 System.out.println(numbers[i]);
      }
//      printing the sum of elements in an array
      int sum = 0;
      for(int i = 0; i<numbers.length;i++) {
    	  sum = sum+numbers[i];
      }
      System.out.println(sum);
      
	}
   
}
