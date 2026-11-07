package com.Arrays;

public class MinElementFind {

	public static void main(String[] args) {
    int [] numbers = {20,34,90,49,78,50};
    int min = numbers[0];
    for(int i = 1; i<numbers.length; i++) {
    	if(numbers[i]<min) {
    		min = numbers[i];
    	}
    }
    System.out.println("Minimum Number: "+min);
 }

}
