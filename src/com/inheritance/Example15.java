package com.inheritance;
 class Animal9{
	 void sound() {
		 
	 }
 }
 class Dog9 extends Animal9{
	 void sound() {
		 System.out.println("Dog barks");
	 }
 }
class Cat9 extends Animal9{
	 void sound() {
		 System.out.println("Cat meows");
	 }
 }
class Lion9 extends Animal9{
	 void sound() {
		 System.out.println("Lion roars");
	 }
 }
public class Example15 {

	public static void main(String[] args) {
		Animal9 d = new  Dog9();
		Animal9 c = new  Cat9();
		Animal9 l = new Lion9();
		d.sound();
		c.sound();
		l.sound();
	}

}
