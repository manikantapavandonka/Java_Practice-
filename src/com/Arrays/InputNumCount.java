package com.Arrays;

public class InputNumCount {
	public static void main(String[] args) {
		
		int positiveCount = 0;
		int negativeCount = 0;
		int zero = 0;
		
    int [] numbers = {2,-3,0,5,0,7,-6,-1,6,5,3,-1};
    
         for(int i=0; i<numbers.length; i++) {
    	    if(numbers[i]>0) {
    	    	positiveCount++;
    	    }else if(numbers[i]<0) {
    	    	negativeCount++;
    	    }else {
    	    	zero++;
    	    }
         }
         System.out.println("Positive Number: "+positiveCount);
         System.out.println("Negative Number: "+negativeCount);
         System.out.println("Zero: "+zero);
	}

}
