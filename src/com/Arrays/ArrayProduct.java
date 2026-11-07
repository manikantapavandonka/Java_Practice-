package com.Arrays;

public class ArrayProduct {

	public static void main(String[] args) {
	int product = 1;
    int [] numbers = {2,3,4,5};
    for(int i=0; i<numbers.length; i++) {
    product = product*numbers[i];
    }
    System.out.println("Product: "+product);
	}

}
