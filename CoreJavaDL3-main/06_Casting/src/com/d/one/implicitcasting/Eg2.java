package com.d.one.implicitcasting;

public class Eg2 {

	public static void main(String[] args) {
		
		byte b1 = 10;
		short s1 = b1;
		System.out.println("Short: " + s1);
		
		short s2 = 20;
		int i1 = s2;
		System.out.println("Int: " + i1);
		
		int i2 = 30;
		long l1 = i2;
		System.out.println("Long: " + l1);
		
		float f1 = 56.40f;
		double d1 = f1;
		System.out.println("Double: " + d1);
		
		char ch = 'A';
		int i3 = ch;
		System.out.println("Int: " + i3);
		
//		short s3 = ch;
//		System.out.println(s3); // Type mismatch: cannot convert from char to short
		
//		byte b2 = ch;
//		System.out.println(b2); // Type mismatch: cannot convert from char to byte

	}

}
