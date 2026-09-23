package com.Encapsulation;

public class BankAccount {
            private long accountNumber;
            private String accountHolder;
            private double balance;
//   constructor---------------------------------------
            BankAccount(long accountNumber, String accountHolder, double balance){
            	this.accountNumber=accountNumber;
            	this.accountHolder=accountHolder;
            	this.balance=balance;
            }
// setters--------------------------------------------
            public void setAccountNumber(long accountNumber) {
            	if(accountNumber <=0) {
            		System.out.println("Invalid account number");
            	}else {
            		this.accountNumber=accountNumber;
            	}
            }
            public void setAccountHolder(String accountHolder) {
            	this.accountHolder=accountHolder;
            }
//  getters-----------------------------------------------
            public long getAccountNumber() {
            	return accountNumber;
            }
            public String getAccountHolder() {
            	return accountHolder;
            }
            public double getBalance() {
            	return balance;
            }
//  methods--------------------------------------------------
            void deposit(int amount) {
            	if(amount<=0) {
            		System.out.println("Invalid amount");
            	}else {
            		balance +=amount;
            		System.out.println("Deposit Successful");
            	}
            }
            
            void withdraw(int amount) {
            if(amount<=0) {
                    System.out.println("Invalid amount");            	
            }else if(amount > balance) {
            		System.out.println("Insufficient balance");
            }else {
            		balance -=amount;
            		System.out.println("Withdrawal Successful");
            	}
            }
            
            void displayAccount() {
            	System.out.println("Account Number:" +getAccountNumber() + 
            			           "\nAccount Holder: "+getAccountHolder() +
            			           "\nBalance: "+getBalance());
            }
            
	public static void main(String[] args) {
             BankAccount obj = new BankAccount(10001L, "krishna",10000.0);
             obj.displayAccount();
             System.out.println();
             System.out.println("Depositing: 5000");
             obj.deposit(5000);
             System.out.println();
             System.out.println("Withdrawing: 3000");
             obj.withdraw(3000);
             System.out.println();
             System.out.println("Final Balance: "+obj.getBalance());
	}

}
