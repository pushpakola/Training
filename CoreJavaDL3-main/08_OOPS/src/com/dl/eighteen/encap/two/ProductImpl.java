package com.dl.eighteen.encap.two;

public class ProductImpl extends Product {

	public static void main(String[] args) {
		
		ProductImpl productImpl = new ProductImpl();
		productImpl.setId("101");
		productImpl.setpName("Samsung");

		System.out.println(productImpl.id);
		System.out.println(productImpl.pName);
	}

}
