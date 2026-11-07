package com.Arrays;

public class Example5 {
	public static void main(String[] args) {
		int evenCount = 0;
		int evenSum = 0;
		int oddCount = 0;
		int oddSum = 0;
     int [] numbers = {4,6,3,7,9,1,2,0,5};
     
     for(int i=0; i<numbers.length; i++) {
    	 if(numbers[i]%2==0) {
    		 evenCount++;
    		 evenSum = evenSum+numbers[i];
    	 }else {
    		 oddCount++;
    		 oddSum = oddSum+numbers[i];
    	 }
     }
     System.out.println("Even: "+evenCount);
     System.out.println("Even Sum: "+evenSum);
     System.out.println("Odd: "+oddCount);
     System.out.println("Odd Sum: "+oddSum);
	}

}
