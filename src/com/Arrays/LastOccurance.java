package com.Arrays;

public class LastOccurance {

	public static void main(String[] args) {
		
    int index = -1;
    
    int [] numbers = {10,20,30,20,50};
     
    for(int i=numbers.length-1;i>=0; i--) {
    	 if(numbers[i]==20) {
    		 index = i;
    		 break;
    	 }
       }
    System.out.println("Last occurance: "+index);
	}

}
