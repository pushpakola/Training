package com.dl.one;

public class Eg4 {
	
	static int b; // Static Variable
	
	int c; // Instance Variable
	

	public static void main(String[] args) {
		
		int a;
		//System.out.println(a); // The local variable a may not have been initialized
		a = 10;
		System.out.println(a);
//		while (true) {
//			
//		}
		a = 20;
		System.out.println(a);
		
		b = 50;
		System.out.println(b);
		
		System.out.println(new Eg4().c);
		
	}
}
