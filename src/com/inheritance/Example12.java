package com.inheritance;
class Animal6{
	String name;
	void eat() {
		
	}
}
class Dog6 extends Animal6{
	@Override
	void eat() {
		System.out.println("Dog eats");
	}
	void sound() {
		System.out.println("Dog barks");
	}
}
class Cat extends Animal6{
	@Override
	void eat() {
		System.out.println("Cat eats");
	}
	void sound() {
		System.out.println("Cat meows");
	}
}
class Lion extends Animal6{
	@Override
	void eat() {
		System.out.println("Lion eats");
	}
	void sound() {
		System.out.println("Lion roars");
	}
}
public class Example12 {

	public static void main(String[] args) {
		Dog6 d= new Dog6();
		Cat c = new Cat();
		Lion l = new Lion();
		
		d.eat();
		d.sound();
		System.out.println();
		c.eat();
		c.sound();
		System.out.println();
		l.eat();
		l.sound();
		

	}

}
