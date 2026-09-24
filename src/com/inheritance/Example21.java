package com.inheritance;
abstract class Employee13{
	String name;
	int id;
	double salary;
	abstract void calculateBonus();
}
class Developer13 extends Employee13{
	void calculateBonus() {
		double newBonus;
		newBonus =salary*20/100;
		System.out.println("Bonus: "+newBonus);
	}
}
class Manager13 extends Employee13{
	void calculateBonus() {
		double newBonus;
		newBonus =salary*30/100;
		System.out.println("Bonus: "+newBonus);
	}
}
public class Example21 {

	public static void main(String[] args) {
		Employee13 e1 = new Developer13();
           e1.name = "Ravi";
           e1.id = 101;
           e1.salary = 50000.0;
           System.out.println("Developer");
       	   System.out.println("Name "+e1.name + "\nID: "+e1.id + "\nSalary: "+e1.salary);
           e1.calculateBonus();
           System.out.println();
           Employee13 e2 = new Manager13();
           e2.name = "Rahul";
           e2.id = 102;
           e2.salary = 60000.0;
           System.out.println("Manager");
       	   System.out.println("Name "+e2.name + "\nID: "+e2.id + "\nSalary: "+e2.salary);
           e2.calculateBonus();
	}

}
