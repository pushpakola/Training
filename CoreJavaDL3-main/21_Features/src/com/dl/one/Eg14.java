package com.dl.one;

interface AA{
	
	default void m1() {
		System.out.println("M1 Method");
	}
}

public class Eg14 implements AA{

	public static void main(String[] args) {

		AA a = new Eg14();
		a.m1();
		
	}

}
