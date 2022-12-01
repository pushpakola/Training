package com.dl.seventeen.abs.three;

public abstract class Client {

	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public static void main(String[] args) {
		
		//new Client();
	}
}
