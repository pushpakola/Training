package com.dl.three.methods;

public class Eg3 {

	public static void main(String[] args) {
		
		System.out.println(new Eg3().add(10, 20));
		System.out.println(new Eg3().getProductDescription("Lenevo Laptop"));
		
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public String getProductDescription(String desc) {
		return desc;
		
	}
}
