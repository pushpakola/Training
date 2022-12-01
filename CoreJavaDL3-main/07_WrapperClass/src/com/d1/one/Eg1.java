package com.d1.one;

public class Eg1 {

	public static void main(String[] args) {
		
		//p to o 
		int i = 10;
		System.out.println("Primitive Type: " + i);
		
		//Para Cons
		Integer integer = new Integer(i);
		System.out.println("PT to OT: " + integer);
		
		//valueOf
		Integer valueOf = Integer.valueOf(i);
		System.out.println("PT to OT: " + valueOf);
		
		//auto boxing
		Integer i2 = i;
		System.out.println("PT to OT: " + i2);
		
		
	}

}
