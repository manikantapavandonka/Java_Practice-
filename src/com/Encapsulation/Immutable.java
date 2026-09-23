package com.Encapsulation;

public class Immutable {
      private final int id;
      private String name;
      private double salary;
//constructor---------------------------------------------    
      Immutable(int id,String name,double salary){
    	  this.id = id;
    	  this.name = name;
    	  this.salary = salary;
      }
//setters----------------------------------------------------
     public void setName(String name) {
    	 this.name = name;
     }
     public void setSalary(double salary) {
    	 this.salary = salary;
     }

//getters-----------------------------------------------------
     public int getId() {
    	 return id;
     }
     public String getName() {
    	 return name;
     }
     public double getSalary() {
    	 return salary;
     }
//methods--------------------------------------------------------
     void display() {
    	 System.out.println("Employee ID: "+id +
    			            "\nName: "+getName() +
    			            "\nSalary: "+getSalary());
     }
	public static void main(String[] args) {
      Immutable obj = new Immutable(101,"krishna",40000.0);
      obj.display();
      System.out.println();
      System.out.println("Updating Name...");
      obj.setName("Ravi");
      System.out.println("Name: "+obj.getName());
      System.out.println();
      System.out.println("Updating Salary...");
      obj.setSalary(45000.0);
      System.out.println("Salary: "+obj.getSalary());
      System.out.println();
      System.out.println("Employee ID: "+obj.getId());
	}

}
