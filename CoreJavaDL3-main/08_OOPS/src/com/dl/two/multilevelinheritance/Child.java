package com.dl.two.multilevelinheritance;

public class Child extends Parent {

	public void m3() {
		System.out.println("M3 Method");
	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
	}
}
