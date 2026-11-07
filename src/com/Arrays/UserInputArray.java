package com.Arrays;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size =sc.nextInt();
        int [] number;
        number = new int [size];
    System.out.println("Enter " + size +" elements: ");
      for(int i=0; i<number.length; i++) {
    	  number[i]=sc.nextInt();
      }
      System.out.println("Array elements: ");
      for(int i=0; i<number.length; i++) {
    	  System.out.print(number[i] + " ");
      }
      sc.close();
	}

}
