package com.dl.seven.constructoroverloading;

public class Eg1 {
	
	public Eg1() {
		System.out.println("Default Constructor");
	}
	
	public Eg1(int a, int b) {
		System.out.println(a+b);
	}
	
	public Eg1(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public Eg1(float a, float b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		new Eg1();
		new Eg1(10, 20);
		new Eg1(10, 20, 30);
		new Eg1(10f, 20f);

	}

}
