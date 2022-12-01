package com.dl.seventeen.abs.six;

abstract class A{
	
	public abstract void m1();
	public abstract void m2();
	
}

abstract class B extends A{
	
	public void m1() {
		System.out.println("M1 Method");
	}
	
}

abstract class C extends B{
	
	public void m2() {
		System.out.println("M2 Method");
	}
}

class D extends C{
	
}
public class Client {

	public static void main(String[] args) {
		
		D d = new D();
		d.m1();
		d.m2();
	}
}
