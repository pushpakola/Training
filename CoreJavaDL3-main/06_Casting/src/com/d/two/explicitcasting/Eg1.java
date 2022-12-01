package com.d.two.explicitcasting;

public class Eg1 {

	public static void main(String[] args) {
		
		double d1 = 65.50;
		float f1 = (float)d1;
		System.out.println("Double to Float: " + f1);
		
		float f2 = 85.50f;
		long l1 = (long)f2;
		System.out.println("Float to Long: " + l1);
		
		long l2 = 5678;
		int i1 = (int)l2;
		System.out.println("Long to Int: " + i1);
		
		int i2 = 40;
		short s1 = (short)i2;
		System.out.println("Int to Short: " + s1);
		
		short s2 = 46;
		byte b1 = (byte)s2;
		System.out.println("Short to Byte: " + b1);
		
		double d2 = 75.80;
		long l3 = (long)d2;
		System.out.println("Double to Long: " + l3);
		
	}

}
