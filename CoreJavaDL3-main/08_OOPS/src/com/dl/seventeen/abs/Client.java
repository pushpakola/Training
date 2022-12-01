package com.dl.seventeen.abs;

abstract class A {

	public void m1() {
		System.out.println("M1 Method of Class A");
	}

	public abstract void m2();

}

class B extends A {

	@Override
	public void m2() {

		System.out.println("M2 Method of Class B");

	}

}

public class Client {

	public static void main(String[] args) {
		
		new B().m1();
		new B().m2();
	}
}
