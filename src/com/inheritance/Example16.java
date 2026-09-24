package com.inheritance;
class Employee10{
	String name;
	int id;
	void work(){
		
	}
}
class Developer10 extends Employee10{
	void work() {
		System.out.println("Developer works with java");
	}
}
class Tester10  extends Employee10{
	void work() {
		System.out.println("Tester works with selenium");
	}
}
public class Example16 {

	public static void main(String[] args) {
    Employee10 d = new Developer10();
    d.name = "Ravi";
    d.id = 101;
    System.out.println("Employee Name: "+d.name + "\nEmployee ID: "+d.id);
    d.work();
    System.out.println();
    Employee10 t = new Tester10();
    t.name = "Kiran";
    t.id = 102;
    System.out.println("Employee Name: "+t.name + "\nEmployee ID: "+t.id);
    t.work();
	}

}
