package com.dl.five.annotations;

public class Client {

	public static void main(String[] args) {
		
		new Client().m1();
	}
	
	@A
	public void m1() {
		System.out.println("M1 Method");
	}
}
