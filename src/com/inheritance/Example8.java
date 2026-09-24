package com.inheritance;
class Animal2{
	void sound(){
		System.out.println("Animal makes a sound");
	}
}
class Dog2 extends Animal2{
	
	void sound(){
		System.out.println("Dog barks");
	}
	
	void display() {
		super.sound();
		sound();
	}
}
public class Example8 {

	public static void main(String[] args) {
     Dog2 obj = new Dog2();
     obj.display();
	}

}
