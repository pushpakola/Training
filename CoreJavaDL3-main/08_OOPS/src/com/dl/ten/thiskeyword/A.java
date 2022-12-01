package com.dl.ten.thiskeyword;

public class A {
	
	int a = 10;

	public A(int a) {
		System.out.println(a); // 20
	}
	
	public A() {
		System.out.println("AA");
	}
	
	public static void main(String[] args) {
		
		A a2 = new A(20);
		A a3 = new A();
		System.out.println(a3.a);
		a3.a = 40;
		System.out.println();
	}
}
