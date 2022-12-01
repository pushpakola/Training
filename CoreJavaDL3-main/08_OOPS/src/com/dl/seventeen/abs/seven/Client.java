package com.dl.seventeen.abs.seven;

class A {

	public void m1() {
		System.out.println("M1 Method");
	}
}

abstract class B extends A {

	public abstract void m2();

	public void m3() {
		System.out.println("M3 Method");
	}

}

class C extends B {

	@Override
	public void m2() {

		System.out.println("M2 Method");
	}

}

public class Client {

	public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
	}
}
