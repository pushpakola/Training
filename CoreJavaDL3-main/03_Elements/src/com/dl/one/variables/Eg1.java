package com.dl.one.variables;

//Instance V
public class Eg1 {
	
	int a = 10;
	int b = 20;
	int c;

	public static void main(String[] args) {
		
		System.out.println(new Eg1().a);
		System.out.println(new Eg1().b);
		System.out.println(new Eg1().c);
		
		Eg1 e = new Eg1();
		e.c = 40;
		System.out.println(e.a);
		System.out.println(e.b);
		System.out.println(e.c);
	}


}
