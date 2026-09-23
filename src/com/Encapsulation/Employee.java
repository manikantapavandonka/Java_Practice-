package com.Encapsulation;

public class Employee {
	
     private int id;
     private String name;
     private double salary;
//     setters--------------------------------
     public void setId(int id) {
    	 if(id<=0) {
    		 System.out.println("Invalid id");
    	 }else {
    		 this.id=id;
    	 }
     }
     public void setName(String name) {
    	 this.name=name;
     }
     public void setSalary(double salary) {
    	 if(salary <= 10000) {
    		 System.out.println("Invalid salary");
    	 }else {
    		 this.salary=salary;
    		 System.out.println("Salary Updated");
    	 }
     }
//   getters---------------------------------------
     public int getId() {
    	 return id;
     }
     public String getName() {
    	 return name;
     }
     public double getSalary() {
    	 return salary;
     }
//     methods-------------------------------------
     void displayDetails() {
    	 System.out.println("Employee ID :"+getId() + "\nName :"+getName() + "\nSalary: "+getSalary());
     }
	public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setId(101);
        obj.setName("krishna");
        obj.setSalary(30000.0);
        obj.displayDetails();
        System.out.println();
        System.out.println("Trying Salary : 5000");
        obj.setSalary(5000.0);
        System.out.println();
        System.out.println("Current Salary: "+obj.getSalary());
        System.out.println();
        System.out.println("Updating Salary :40000");
        obj.setSalary(40000);
        System.out.println();
        System.out.println("Current Salary :"+obj.getSalary());
	}

}
