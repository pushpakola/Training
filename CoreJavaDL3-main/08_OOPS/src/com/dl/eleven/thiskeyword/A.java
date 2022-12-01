package com.dl.eleven.thiskeyword;

class B{
	
	A  a;

	public B(A a) {
		System.out.println("Cons B");
		this.a = a;
	} 
	
	
}
public class A {
	
	public A() {
		System.out.println("Cons A");
		new B(this);
	}

	int a = 10;
	
	public void IdNumber() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		new A().IdNumber();
	}
}
