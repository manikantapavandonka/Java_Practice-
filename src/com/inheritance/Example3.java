package com.inheritance;
class Employee2{
	String name;
	int id;
	double salary;
	void displayEmployee() {
		System.out.println("Employee Name: "+name + "\nEmployee ID: "+id + "\nSalary: "+salary);
	}
}
class Child2 extends Employee2{
	String department;
	double bonus;
	void displayManager() {
		System.out.println("Department: "+department + "\nBonus: "+bonus);
	}
}
public class Example3 {

	public static void main(String[] args) {
       Child2 obj = new Child2();
       obj.name = "Rahul";
       obj.id = 101;
       obj.salary = 50000.0;
       obj.department = "IT";
       obj.bonus = 10000.0;
       obj.displayEmployee();
       obj.displayManager();
	}

}
