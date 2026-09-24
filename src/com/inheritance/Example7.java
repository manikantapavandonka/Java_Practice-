package com.inheritance;
class Person2{
	String name;
	Person2(String name){
		this.name = name;
		System.out.println("Person Constructor");
	}
}
class Employee3 extends Person2{
	int id;
	Employee3(String name, int id){
		super(name);
		this.id = id;
		System.out.println("Employee Constructor");
	}
}
public class Example7 {

	public static void main(String[] args) {
     Employee3 obj = new Employee3("Ravi",101);
     System.out.println("Name: "+obj.name);
     System.out.println("ID: "+obj.id);
	}

}
