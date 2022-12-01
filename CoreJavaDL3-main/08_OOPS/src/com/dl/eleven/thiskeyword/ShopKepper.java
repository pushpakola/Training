package com.dl.eleven.thiskeyword;

class Customer{
	
	public Customer(ShopKepper shopKepper) {
		System.out.println("Customer ");
	}
}

class Owner{
	
	public Owner(ShopKepper shopKepper) {
		System.out.println("Owner");
	}
}
public class ShopKepper {
	
	public void help() {
		new Customer(this);
		new Owner(this);
	}

	public static void main(String[] args) {
		
		new ShopKepper().help();
		
	}
}
