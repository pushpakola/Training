package com.dl.one;

public class Eg20 {

	public static void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {

		Eg20.add();
		add();
		
		//Method Ref
		//ClassName :: StaticMethodName
		Thread t1 = new Thread(Eg20::add);
		t1.start();
		
		Thread t2 = new Thread(()->add());
		t2.start();
	}

}
