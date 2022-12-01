package com.dl.three.annotations;

public class Client extends A {
	
	//@Override
	public void m1(Integer i) {
		System.out.println("M1 Method: " + i);
	}

	public static void main(String[] args) {
		
		Client client = new Client();
		client.m1(10);
		client.m1(20);
	}
}
