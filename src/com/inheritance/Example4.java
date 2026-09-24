package com.inheritance;
class Animal{
	String name;
	void eat() {
		System.out.println("Sparky is eating");
	}
}
class Dog extends Animal{
	String breed;
	void bark() {
		System.out.println("Sparky is barking");
	}
}
public class Example4 {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.name = "Sparky";
		System.out.println("Animal Name: "+obj.name);
		obj.breed = "beagle";
		System.out.println("Breed: "+obj.breed);
		obj.eat();
		obj.bark();
	}

}
