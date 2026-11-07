package com.Arrays;

public class FirstOccurance {
    int target = 20;
	public static void main(String[] args) {
		int index = -1;
     int [] numbers = {10,20,30,20,50};
     for(int i=0; i<numbers.length;i++) {
    	 if(numbers[i] ==20) {
    		 index=i;
    		 break;
    	 }
      }
     System.out.println("First occurance: "+index);
      
	}

}
