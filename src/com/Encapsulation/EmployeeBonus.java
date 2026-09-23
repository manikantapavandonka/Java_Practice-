package com.Encapsulation;

public class EmployeeBonus {
         private int id;
         private String name;
         private double salary;
         private double bonus;
         EmployeeBonus(int id, String name, double salary, double bonus){
        	 this.id = id;
        	 this.name = name;
        	 this.salary = salary;
        	 this.bonus = bonus; 
         }
         
         public void setId(int id) {
        	 this.id = id;
         }
         public void setName(String name) {
        	 this.name = name;
         }
         public void setBonus(double bonus) {
        	 if(bonus>=0) {
        		 this.bonus = bonus;        		 
        	 }else {
        		 System.out.println("Invalid Bonus!");
        	 }
         }
         
         public int getId() {
        	 return id;
         }
         public String getName() {
        	 return name;
         }
         public double getSalary() {
        	 return salary;
         }
         public double getBonus() {
        	 return bonus;
         }
         double annualSalary;
         void addBonus() {
        	 System.out.println("Bonus Added: "+getBonus());
         }
         
         double getAnnualSalary() {
        	 annualSalary = salary*12;
        	 return annualSalary;
         }
         
         double getTotalCompensation() {
        	 return getAnnualSalary()+bonus;
         }
         
         void display() {
        	 System.out.println("Employee: "+getName() + "\nMonthly salary: "+getSalary());
         }
	public static void main(String[] args) {
		EmployeeBonus obj = new EmployeeBonus(101,"Krishna",50000.0,20000.0);
		obj.display();
		System.out.println();
		obj.addBonus();
		System.out.println();
		System.out.println("Annual Salary: "+obj.getAnnualSalary());
		System.out.println("Bonus: "+obj.getBonus());
		System.out.println("Total Compensation: "+obj.getTotalCompensation());

	}

}
