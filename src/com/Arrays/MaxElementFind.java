package com.Arrays;

public class MaxElementFind {
	public static void main(String[] args) {
		int[]numbers= {23,46,89,12,34,54,46};
		int max = numbers[0];
     for(int i =1; i<numbers.length; i++) {
    	 if(numbers[i]>max) {
    		 max = numbers[i];
    	 }
     }
     System.out.println("Maximum Number: "+ max);
	}

}
