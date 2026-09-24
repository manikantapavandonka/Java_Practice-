package com.inheritance;

class person{
	String name = "mahesh";
	int age = 22;
	void displayPerson() {
		System.out.println("Name :" +name + "\nAge :" +age);
	}
}
class Employee extends person{
	int employeeId = 101;
	int salary = 20000;
	void displayEmployee() {
		System.out.println("Employee Id :" +employeeId + "\nSalary :" +salary);
	}
}
class manager extends Employee{
	int teamSize = 4;
	void manageTeam() {
		System.out.println("Team Size :" +teamSize);
	}
}
public class Example2 {

	public static void main(String[] args) {
       manager obj = new manager();
       obj.displayPerson();
       obj.displayEmployee();
       obj.manageTeam();
	}

}
