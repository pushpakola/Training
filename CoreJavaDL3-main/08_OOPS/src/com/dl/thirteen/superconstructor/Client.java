package com.dl.thirteen.superconstructor;

class A{
	
	public A() {
		System.out.println("Default Constructor of Class A");
	}
	
	public A(int i) {
		this();
		System.out.println("Parameterised Constructor: " + i);
	}
}

class B extends A{
	
	public B() {
		//super();
		super(10);
		System.out.println("Default Constructor of Class B");
	}
}
public class Client {

	public static void main(String[] args) {
		
		new B();
	}
}
