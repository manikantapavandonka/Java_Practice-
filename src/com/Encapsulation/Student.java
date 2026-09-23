package com.Encapsulation;
public class Student {
//	private variables-------------------------
             private String name;
             private int id;
             private double marks;
// setters---------------------------------------
             public void setName(String name) {
            	 this.name=name;
             }
             public void setId(int id) {
            	 if(id<=0) {
            		 System.out.println("Invalid id");
            	 }else {
            		 
            		 this.id=id;
            	 }
             }
             public void setMarks(double marks) {
            	 if(marks<0 || marks>100) {
            		 System.out.println("Invalid marks");
            	 }else {
            		 this.marks=marks;
            	 }
             }
// getters--------------------------------------
             public String getName() {
            	 return name;
             }
             public int getId() {
            	 return id;
             }
             public double getMarks() {
            	 return marks;
             }
//  methods-------------------------------------
             void displayStudent() {
            	 System.out.println("Name :"+name + "\nId :"+id + "\nMarks :"+marks);
             }
	public static void main(String[] args) {
          Student obj = new Student();
          obj.setName("karthik");
          obj.setId(101);
          obj.setMarks(85.0);
          obj.displayStudent();
          System.out.println();
          System.out.println("Trying to set marks: 150");
          obj.setMarks(150.0);
          System.out.println();
          System.out.println("Marks after update: "+obj.getMarks());
	}

}
