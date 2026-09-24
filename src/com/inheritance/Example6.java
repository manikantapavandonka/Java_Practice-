package com.inheritance;
class Person1{
	String name = "Ravi";
}
class Student extends Person1{
	String name = "Kiran";
	void displayNames(){
		System.out.println("Child Name: "+name);
		System.out.println("Parent Name: "+super.name);
	}
}
public class Example6 {

	public static void main(String[] args) {
     Student obj = new Student();
     obj.displayNames();
	}

}
