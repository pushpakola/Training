package com.dl.sixteen.upcasting;

class A{
	
	public void m1() {
		System.out.println("M1 Method of Class A");
	}
}
public class B extends A{

	public void m1() {
		System.out.println("M1 Method of Class B");
	}
	
	public static void main(String[] args) {
		
		A a = new B();
		a.m1();
		
		B b = new B();
		A aa = b;
		aa.m1();
	}
}
