package com.Arrays;

public class IndexFinding {
	
	public static void main(String[] args) {
		
		int target = 30;
		int index = -1;
		
      int [] numbers = {10,20,30,40,50};
      
      for(int i=0; i<numbers.length; i++) {
    	  
    	  if(numbers[i]==target) {
    		  index = i;
    		  break;
    	  }
       }
      if(index != -1) {
    	  System.out.println("Element found at index: "+index);
      }else {
    	  System.out.println("Element not found");
      }
	}

}
