package com.dl.three.methods;

public class Eg5 {

	public static void main(String[] args) {
		
	    new Eg5("Sai");
		
		new Eg5();
	}
	
	public Eg5() {
		System.out.println("Default Constructor");
	}
	
	public Eg5(String studentName) {
		System.out.println(studentName);
	}
}
