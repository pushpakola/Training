package com.dl.three.casting;

public class Eg1 {

	public static void main(String[] args) {
		
		long l1 = 10;
		float f1 = l1;
		System.out.println("Implicit: " + f1);
		
		float f2 = 44.55f;
		long l2 = (long)f2;
		System.out.println("Explicit: " + l2);

		int i = 10;
		short s = (short)i;
		System.out.println(s);
		
		int i2 = 30;
		long l3 = i2;
		
		long l4 = 40;
		int i3 = (short)l4;
		int i4 = (int)l4;
		int i5 = (byte)l4;
		System.out.println(i5);
		
	}

}
