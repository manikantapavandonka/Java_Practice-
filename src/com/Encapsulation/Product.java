package com.Encapsulation;

public class Product {
       private int productId;
       private String productName;
       private double price;
       private double discount;
       private double totalPrice;
       
       Product(int productId, String productName, double price, double discount){
    	   this.productId = productId;
    	   this.productName = productName;
    	   this.price = price;
    	   this.discount = discount;
       }
       
       public String getProductName() {
    	   return productName;
       }
       public double getPrice() {
    	   return price;
       }
       public double getDiscount() {
    	   return discount;
       }
       
       double discountAmount;
       void discount() {
    	   discountAmount = price *discount/ 100;
    	   System.out.println("Discount Amount: "+discountAmount);
       }
       void finalPrice() {
    	   totalPrice = price - discountAmount;
    	   System.out.println("Final Price: "+totalPrice);
       }
	public static void main(String[] args) {
         Product obj = new Product(1,"laptop",50000.0,10.0);
         System.out.println("Product: "+obj.getProductName() + 
        		            "\nPrice: "+obj.getPrice() +
        		            "\nDiscount: "+obj.getDiscount()+"%");
         System.out.println();
         obj.discount();
         obj.finalPrice();
	}

}
