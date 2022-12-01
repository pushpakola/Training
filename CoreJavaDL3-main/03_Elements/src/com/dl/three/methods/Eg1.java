package com.dl.three.methods;

public class Eg1 {

	public static void main(String[] args) {

		new Eg1().m1();
		new Eg1().m2();
		
		Eg1 eg1 = new Eg1();
		eg1.m1();
		eg1.m2();
	}

	// Instance Method
	public void m1() {
		System.out.println("M1 Method");
	}

	// Instance Method
	public void m2() {
		System.out.println("M2 Method");
	}

}
