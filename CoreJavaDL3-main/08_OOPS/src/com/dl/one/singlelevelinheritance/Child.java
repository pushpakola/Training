package com.dl.one.singlelevelinheritance;

public class Child extends Parent{

	public void m2() {
		System.out.println("M2 Method");
	}
	
	public static void main(String[] args) {
		
		new Child().m1();
		new Child().m2();
	}
}
