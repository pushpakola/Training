package com.dl.twelve;

class A{
	
	public void m1() {
		System.out.println("M1 Method of Class A");
	}
}

class B extends A{
	

	public void m1() {
		System.out.println("M1 Method of Class B");
	}
	
	public void m2() {
		this.m1();
		System.out.println("M2 Method of Class B");
		super.m1();
	}
}
public class Client {

	public static void main(String[] args) {
		
//		B b = new B();
//		b.m1();
//		b.m2();
//		
//		A a = new B();
//		a.m1();
		
		new B().m2();
	}
}
