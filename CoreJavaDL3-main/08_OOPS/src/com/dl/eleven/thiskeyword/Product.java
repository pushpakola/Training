package com.dl.eleven.thiskeyword;

public class Product {
	
	public Product get() {
		Product p = new Product();
		return p;
	}
	
	public Product put() {
		return this;
	}

	public static void main(String[] args) {
		
		Product product = new Product();
		System.out.println(product.get());
		System.out.println(product.get());
		System.out.println(product.get());
		
		System.out.println(product.put());
		System.out.println(product.put());
		System.out.println(product.put());

	}

}
