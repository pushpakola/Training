package com.dl.one;

public class Eg1 {

	public void m1() {
		System.out.println("Public M1 Method");
	}
	
	protected void m2() {
		System.out.println("Protected M2 Method");
	}
	
	void m3() {
		System.out.println("Default M3 Method");
	}
	
	private void m4() {
		System.out.println("Private M4 Method");
	}
	
	public static void main(String[] args) {
		
		new Eg1().m1();
		new Eg1().m2();
		new Eg1().m3();
		new Eg1().m4();
	}
	
}
