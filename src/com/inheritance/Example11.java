package com.inheritance;
class Person6{
	String name;
	Person6(String name){
		this.name = name;
		System.out.println("Person Constructor");
	}
}
class Employee6 extends Person6{
	int employeeId;
	Employee6(String name, int employeeId){
		super(name);
		this.employeeId = employeeId;
		System.out.println("Employee Constructor");
	}
}
class Manager4 extends Employee6{
	String department;
	Manager4(String name, int employeeId, String department){
		super(name, employeeId);
		this.department=department;
		System.out.println("Manager Constructor");
	}
	void display() {
		System.out.println("Name: "+name + "\nEmployee ID: "+employeeId + "\nDepartment: "+department);
	}
}
public class Example11 {

	public static void main(String[] args) {
            Manager4 obj = new Manager4("Ravi", 101, "IT");
            obj.display();
	}

}
