package com.inheritance;
class Bank2{
	double rate;
	void getInterestRate(){
		
	}
}
class SBI extends Bank2{
void getInterestRate(){
		System.out.println("SBI Interest Rate: "+rate);
	}
}
class HDFC extends Bank2{
void getInterestRate(){
	System.out.println("HDFC Interest Rate: "+rate);
	}
}
class ICICI extends Bank2{
void getInterestRate(){
	System.out.println("ICICI Interest Rate: "+rate);
	}
}
public class Example17 {

	public static void main(String[] args) {
     Bank2 s = new SBI();
     Bank2 h = new HDFC();
     Bank2 i = new ICICI();
     s.rate = 7.5;
     h.rate = 7.0;
     i.rate = 7.25;
     
     s.getInterestRate();
     h.getInterestRate();
     i.getInterestRate();
	}

}
