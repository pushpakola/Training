package com.dl.ten.thiskeyword;

public class Customer {

	public void m1(Customer Customer) {
		System.out.println("M1 Method");
	}
	
	public void m2() {
		m1(this);
		System.out.println("M2 Method");
	}
	
	public static void main(String[] args) {
		
		new Customer().m2();
	}
}
