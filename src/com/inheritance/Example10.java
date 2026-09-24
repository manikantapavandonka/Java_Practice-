package com.inheritance;
class Vehicle5{
	Vehicle5(String brand,int speed){
         this.brand = brand;
         this.speed = speed;
	}
	String brand;
	int speed;
}
class Car4 extends Vehicle5{
	String model;
	String fuelType;
	Car4(String brand, int speed, String model,String fuelType){
		super(brand,speed);
		this.model = model;
		this.fuelType = fuelType;
	}
}
class SportsCar extends Car4{
	String turbo;
	double price;
	SportsCar(String brand, int speed, String model,String fuelType ,String turbo, double price){
		super(brand, speed, model, fuelType);
		this.turbo = turbo;
		this.price = price;
	}
	void display() {
		System.out.println("Brand: "+brand);
		System.out.println("Speed: "+speed);
		System.out.println("Model: "+model);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("turbo: "+turbo);
		System.out.println("Price: "+price);
		 
	}
}
public class Example10 {

	public static void main(String[] args) {
     SportsCar obj = new SportsCar("BMW",250,"M4","Petrol","Yes",9000000.0);
     obj.display();
     
	}

}
