package com.dl.eight.methodoveriding;

class Parent{
	
	public void m1() {
		System.out.println("M1 Method Parent");
	}
}

public class Child extends Parent{

	public void m1() {
		System.out.println("M1 Method Child");
	}
	
	public static void main(String[] args) {
		
//		Parent p = new Parent();
//		p.m1(); // M1 Method Parent
		
//		Child c = new Child();
//		c.m1(); // M1 Method Child
		
		Parent p = new Child();
		p.m1(); // M1 Method Child
		
	}
}
