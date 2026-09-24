package com.inheritance;
 class Person{
	 String name;
	 int age;
	 void displayPerson() {
		 System.out.println("Name: "+name + "\nAge: "+age);
	 }
 }
 class Child extends Person{
	 int studentId;
	 String course;
	 void displayStudent() {
		 System.out.println("Student ID: "+studentId + "\nCourse: "+course);
	 }
 }
 public class Example1 {
	public static void main(String[] args) {
     Child obj = new Child();
     obj.name = "Ravi";
     obj.age = 22;
     obj.studentId = 101;
     obj.course ="Java Full Stack";
     obj.displayPerson();
     obj.displayStudent();
	}

}
