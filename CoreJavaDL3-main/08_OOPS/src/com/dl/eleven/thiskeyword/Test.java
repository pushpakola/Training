package com.dl.eleven.thiskeyword;

public class Test {

	public void m1() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		System.out.println(test);
		
		test.m1();
	}
}
