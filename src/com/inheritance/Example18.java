package com.inheritance;
class Animal11{
	void sound() {
		
	}
	void fetchBall() {
		
	}
}
class Dog11 extends Animal11{
	void sound() {
		System.out.println("Dog makes sound");
	}
	void fetchBall() {
		System.out.println("Dog fetches the ball");
	}
}
public class Example18 {

	public static void main(String[] args) {
           Animal11 a = new Dog11();
           Dog11 d = (Dog11) a;
           d.sound();
           d.fetchBall();
	}

}
