package com.Encapsulation;

public class ATM {
       private long accountNumber;
       private String accountHolder;
       private int pin;
       private double balance;
       
       ATM(long accountNumber, String accountHolder, int pin, double balance){
    	   this.accountNumber = accountNumber;
    	   this.accountHolder = accountHolder;
    	   this.pin = pin;
    	   this.balance = balance;
       }
       
       public void setAccountNumber(long accountNumber) {
    	   this.accountNumber = accountNumber;
       }
       public void setAccountHolder(String accountHolder) {
    	   this.accountHolder = accountHolder;
       }
        
       public long getAccountNumber() {
    	   return accountNumber;
       }
       public String getAccountHolder() {
    	   return accountHolder;
       }
       public double getBalance() {
    	   return balance;
       }
       
       void deposit(int amount) {
    	   if(amount<=0) {
    		   System.out.println("Invalid amount");
    	   }else {
    		   balance = balance + amount;
    		   System.out.println(balance);
    	   }
       }
       void withdraw(int amount) {
    	   if(amount<=0) {
    		   System.out.println("Invalid amount");
    	   }else if(amount>balance) {
    		   System.out.println("Insufficient amount");
    	   }else {
    		   balance = balance - amount;
    		   System.out.println("Withdraw: "+amount);
    		   System.out.println("Withdrawal Successful");
    	   }
       }
       void checkBalance(int pin ){
    	   if(this.pin != pin) {
    		   System.out.println("Invalid pin");
    		   System.out.println("Access Denied");
    	   }else{
    		   System.out.println("PIN verified");
    		   System.out.println();
    		   System.out.println("Current Balance: "+balance);
    	   }
       }
       void changePin(int oldPin, int newPin) {
    	   if(this.pin != oldPin) {
    		   System.out.println("Invalid pin");
    	   }else{
    		   this.pin = newPin;
    	   }
       }
	public static void main(String[] args) {
             ATM obj = new ATM(23456788,"Krishna",1234,40000.0);
             System.out.println("Account Holder: "+obj.getAccountHolder());
             System.out.println();
             System.out.println("Enter PIN: 1234");
             obj.checkBalance(1234);
             System.out.println();
             obj.withdraw(25000);
             System.out.println();
             System.out.println("Remaining Balance: "+obj.getBalance());
             
             System.out.println();
             System.out.println("Enter PIN: 1111");
             obj.checkBalance(1111);
	}

}
