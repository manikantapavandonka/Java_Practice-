package com.inheritance;
class Payment{
	double amount;
	Payment(double amount){
		this.amount=amount;
	}
	void pay() {
		
	}
}
class CreditCard extends Payment{
	CreditCard(double amount){
		super(amount);
	}
	void pay() {
		System.out.println("Payment through Credit Card");
		System.out.println("Amount: "+amount);
	}
}
class UPI extends Payment{
	UPI(double amount){
		super(amount);
	}
	void pay() {
		System.out.println("Payment through UPI");
		System.out.println("Amount: "+amount);
	}
}
class NetBanking extends Payment{
	NetBanking(double amount){
		super(amount);
	}
	void pay() {
		System.out.println("Payment through Net Banking");
		System.out.println("Amount: "+amount);
	}
}
public class Example14 {

	public static void main(String[] args) {
		CreditCard c = new CreditCard(5000.0);
		c.pay();
		System.out.println();
		UPI u = new UPI(2500.0);
		u.pay();
		System.out.println();
		NetBanking n = new NetBanking(10000.0);
		n.pay();

	}

}
