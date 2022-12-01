package com.dl.one;

public class Eg1 {

	static int x = 5;
	int y = 10;
	
	public static void main(String[] args) {
		
		int a = 10, b = 20;
		System.out.println("LV " + a);
		System.out.println("LV " + b);
		System.out.println("SV " + x);
		System.out.println("IV " + new Eg1().y);
	}
}
