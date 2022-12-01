package com.dl.fifteen.casting;

class A{
	
	public void m1() {
		System.out.println("M1 Method of Class A");
	}
}
public class B extends A{
	
	public void m1() {
		System.out.println("M1 Method of Class B");
	}

	public void m2() {
		System.out.println("M2 Method of Class B");
	}
	
	public static void main(String[] args) {
		
//		A a = new B();
//		a.m1();
		
//		A a = new A();
//		B b = (B)a;
		
//		B b = new B();
//		A a = b;
//		a.m1();
		
		A a = new B();
		B b = (B)a;
		b.m1();
		b.m2();
		
		
	}
}
