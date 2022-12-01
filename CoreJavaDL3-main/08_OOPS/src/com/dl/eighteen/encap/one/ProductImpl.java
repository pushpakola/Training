package com.dl.eighteen.encap.one;

public class ProductImpl extends Product{

	public static void main(String[] args) {
		
		ProductImpl productImpl = new ProductImpl();
		productImpl.id = 101;
		productImpl.pName = "Samsung";
		System.out.println(productImpl.id);
		System.out.println(productImpl.pName);
	}
}
