package com.inheritance;
class Employee12{
	String language;
	int size;
	void role() {
		
	}
	void work() {
		
	}
}
class Developer12 extends Employee12{
	void role() {
		System.out.println("Employee is Developer");
	}
	void work() {
		System.out.println("Programming Language: "+language);
	}
}
class Manager12 extends Employee12{
    void role() {
		System.out.println("Employee is Manager");
	}
	void work() {
		System.out.println("Team Size: "+size);
	}
}
public class Example19 {

	public static void main(String[] args) {
          Employee12 d = new Developer12();
          if(d instanceof Developer12) {
        	  Developer12 de = (Developer12)d;
        	  de.language = "java";
        	  de.role();
        	  de.work();
          }
          System.out.println();
          Employee12 m = new Manager12();
          if(m instanceof Manager12) {
        	  Manager12 ma = (Manager12) m;
        	  ma.size = 10;
        	  ma.role();
        	  ma.work();
          }
	}

}
