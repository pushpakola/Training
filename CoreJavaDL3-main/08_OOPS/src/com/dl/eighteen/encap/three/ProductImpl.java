package com.dl.eighteen.encap.three;

public class ProductImpl extends Product {

	public static void main(String[] args) {
		
		ProductImpl productImpl = new ProductImpl();
		productImpl.setId(101);
		productImpl.setpName("Samsung");

		System.out.println(productImpl.getId());
		System.out.println(productImpl.getpName());
	}
}
