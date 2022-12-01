package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {
		
		int a = 10; // '0b1010'
		int b = 2; //  '0b0010'
		
		System.out.println(a & b); // 2   //0b0010
		System.out.println(a | b); // 10 // 0b1010
		System.out.println(a ^ b); // 8
	}
}
