package com.Arrays;

public class LinearSearch {

	static boolean found = false;
	public static void main(String[] args) {
		
       int [] array = {10,20,30,40,50};
       
       for(int i = 0; i<array.length; i++) {
    	   if(array[i]==60) {
    		   found = true;
    		   break;
    	   }
       }
       
       if(found) {
    	   System.out.println("Element found");
       }else {
    	   System.out.println("Element not found");
       }
	} 

}
