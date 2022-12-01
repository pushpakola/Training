package com.dl.three.methods;

public class Eg6 {

	int a = 10; // Instance Variable
	
	public static void main(String[] args) {
		
		System.out.println(new Eg6().a);
		new Eg6().m1();
		new Eg6();
		System.out.println(new Eg6().add(10, 20));
	}
	
	//Instance Method
	public void m1() {
		System.out.println("Instance Method");
	}
	
	//Constructor
	public Eg6() {
		System.out.println("Default Constructor");
	}
	
	//Instance Method
	public int add(int a, int b) {
		return a+b;
	}
	
}
