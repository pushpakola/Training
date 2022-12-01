package com.dl.two.annotations;

public class Client {

	public static void main(String[] args) {
		
		A a = new A();
		a.m1(); // The method m1() from the type A is deprecated
		a.m2(); // The method m2() from the type A is deprecated
		
		B b = new B();
		b.m3();
		b.m4();
	}
}
