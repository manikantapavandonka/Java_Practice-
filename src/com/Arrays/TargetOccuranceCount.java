package com.Arrays;
import java.util.Scanner;
public class TargetOccuranceCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int target = 0;
		int targetCount=0;
		
      int [] numbers = {10,20,10,30,10};
      
      System.out.println("Enter the target value: ");
      target = sc.nextInt();
      
        for(int i=0; i<numbers.length; i++) {
        	
        	
        	if(numbers[i]==target) {
        		targetCount++;
        	}
        }
        
        System.out.println(targetCount);
        
        sc.close();
	}
}
