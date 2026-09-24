package com.inheritance;
 class Employee7{
	 String name;
	 int id;
	 double salary;
	 Employee7(String name, int id, double salary){
		 this.name = name;
		 this.id = id;
		 this.salary = salary;
	 }
 }
 class Developer extends Employee7{
	 String programmingLanguage;
	 Developer(String name,int id, double salary, String programmingLanguage){
		 super(name,id,salary);
		 this.programmingLanguage = programmingLanguage;
	 }
	 void displayDeveloper() {
		 System.out.println("Developer: "+name + "\nLanguage: "+programmingLanguage);
	 }
 }
 class Tester extends Employee7{
	 String testingTool;
	 Tester(String name,int id, double salary, String testingTool){
		 super(name, id, salary);
		 this.name = name;
		 this.testingTool = testingTool;
	 }
	 void displayTester() {
		 System.out.println("Tester: "+name + "\nTesting Tool: "+testingTool);
	 }
 }
 class Manager8 extends Employee7{
	 int teamSize;
	 Manager8(String name,int id, double salary, int teamSize){
		 super(name,id,salary);
		 this.teamSize = teamSize;
	 }
	 void displayManager() {
		 System.out.println("Manager: "+name + "\nTeam Size: "+teamSize);
	 }
 }
public class Example13 {

	public static void main(String[] args) {
       Developer d = new Developer("Ravi",0,0.0,"Java");
       d.displayDeveloper();
       System.out.println();
       Tester t = new Tester("Kiran",0,0.0,"Selenium");
       t.displayTester();
       System.out.println();
       Manager8 m = new Manager8("Rahul",0,0.0,10);
       m.displayManager();
	}

}
