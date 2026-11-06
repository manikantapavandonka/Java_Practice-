package com.constructor;

public class Example1 {
	    static String school="vidya";
	    String name;
        int age;
        char gender;
        
        Example1(String name, int age, char gender){
        	this.name = name;
        	this.age = age;
        	this.gender = gender;
        }
        
	public static void main(String[] args) {
		 Example1 obj = new Example1("mani", 22, 'm');
		 System.out.println("Name of School :" +school + "\nName Of Student :" +obj.name +"\nAge :"+obj.age +"\nGender :"+obj.gender);
	}

}
