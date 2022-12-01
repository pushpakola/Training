package com.dl.one.variables;

// Static Variable
public class Eg2 {

	static int a = 10;
	static int b = 20;
	static int c;

	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		c = 30;
		System.out.println(Eg2.a);
		System.out.println(Eg2.b);
		System.out.println(Eg2.c);
		
	}
}
