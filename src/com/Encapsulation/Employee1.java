package com.Encapsulation;
class Address{
	private String city;
	private int pincode;
	
	Address(String city, int pincode){
		this.city = city;
		this.pincode = pincode;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getCity() {
		return city;
	}
	public int getPincode() {
		return pincode;
	}
}


public class Employee1 {
    private int id;
    private String name;
    private Address address;
    
    Employee1(int id, String name, Address address){
    	this.id = id;
    	this.name = name;
    	this.address = new Address(address.getCity(),address.getPincode());
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    public void setName(String name) {
    	this.name = name;
    }
     
    public int getId() {
    	return id;
    }
    public String getName() {
    	return name;
    }
    public Address getAddress() {
    	return address;
    }
	public static void main(String[] args) {
        Address ad = new Address("Hyderabad",500023);
        Employee1 em = new Employee1(101,"Krishna",ad);
        System.out.println("Before external modification: ");
        System.out.println("Employee City: "+em.getAddress().getCity());
        System.out.println();
        System.out.println("Changing external Address to Mumbai...");
        ad.setCity("mumbai");
        System.out.println();
        System.out.println("After external modification:");
        System.out.println("Employee City: "+em.getAddress().getCity());
	}

}
