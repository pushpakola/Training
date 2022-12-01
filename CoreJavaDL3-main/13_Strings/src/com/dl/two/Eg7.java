package com.dl.two;

class B{
	
	public B() {
		System.out.println("Default Constructor");
	}
}
public class Eg7 {

	public static void main(String[] args) {
		
		String s1 = new String("Java"); // 2 
		String s2 = new String("Python"); // 2
		String s3 = new String("Java"); // 2
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		B b1 = new B();
		B b2 = new B();
		System.out.println(b1.equals(b2)); // ==

	}

}
