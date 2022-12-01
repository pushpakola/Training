package com.dl.three.casting;

public class Eg3 {

	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 20;
		
		long l1 = (long)i1+i2;
		System.out.println(l1);
		
		float f1 = 30.0f;
		float f2 = 20.0f;
		double d1 = f1+f2;
		System.out.println(d1);
		
		double d2 = 50.0;
		double d3 = 65.0;
		float f3 = (float)(d2+d3);
		System.out.println(f3);
	}
}
