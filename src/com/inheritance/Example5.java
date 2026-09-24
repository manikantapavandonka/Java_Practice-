package com.inheritance;
class Vehicle{
	String brand;
	double price;
	
	Vehicle(String brand, double price){
		this.brand = brand;
		this.price = price;
	}
	void displayVehicle(){
		System.out.println("Brand: "+brand + "\nPrice: "+price);
	}
}
class Car extends Vehicle {
	String model;
	String fuelType;
	Car(String brand, double price, String model, String fuelType){
		super(brand,price);
		this.model = model;
		this.fuelType = fuelType;
	}
	void displayCar(){
		System.out.println("Model: "+model + "\nFuel Type: "+fuelType);
	}
}
public class Example5 {
   public static void main(String []args) {
	   Car obj = new Car("Toyota",1500000.0,"Fortuner","Diesel");
	   obj.displayVehicle();
	   obj.displayCar();
   }
}
