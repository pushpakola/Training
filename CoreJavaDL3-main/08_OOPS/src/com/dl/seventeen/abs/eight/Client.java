package com.dl.seventeen.abs.eight;

public class Client {
	
	public int a = 10;
	public int b = 20;
	
	public static int x = 100;
	public static int y = 200;
	
	public void m1() {
		System.out.println("M1 Method");
	}
	
	public static void m2() {
		System.out.println("M2 Method");
	}
	
	public static void main(String[] args) {
		
		System.out.println(x);
		System.out.println(y);
		m2();
		
	}
}
