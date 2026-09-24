package com.inheritance;
class Person4{
	String name;
	int age;
	Person4(String name, int age){
		this.name = name;
		this.age = age;
	}
}
class Employee5 extends Person4{
	int employeeId;
	double salary;
	Employee5(String name, int age, int employeeId, double salary){
		super(name,age);
		this.employeeId = employeeId;
		this.salary = salary;
	}
}
class Manager3 extends Employee5{
	String department;
	double bonus;
	Manager3(String name, int age, int employeeId, double salary, String department, double bonus){
		super(name, age, employeeId, salary);
		this.department = department;
		this.bonus = bonus;
	}
	void displayPerson() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	void displayEmployee() {
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Salary: "+salary);
	}
	
	void displayManager() {
		System.out.println("Department: "+department);
		System.out.println("Bonus: "+bonus);
	}
}
public class Example9 {

	public static void main(String[] args) {
      Manager3 obj = new Manager3("Ravi",25,101,60000.0,"IT",15000.0);
      obj.displayPerson();
      obj.displayEmployee();
      obj.displayManager();
	}

}
