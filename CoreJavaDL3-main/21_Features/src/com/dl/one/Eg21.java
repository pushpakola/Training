package com.dl.one;

public class Eg21 {
	
	public void add() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		Eg21 eg21 = new Eg21();
		eg21.add();
		
		new Eg21().add();
		
		//ClassName :: MethodName
		Thread t1 = new Thread(new Eg21()::add);
		t1.start();
		
		//Lambda
		Thread t2 = new Thread(()->eg21.add());
		t2.start();

	}
}
