package com.dl.one;

public class Eg8 {

	public static void main(String[] args) {

		char ch[] = { 'A', 'B', 'C', 'D', 'E' };
		String s1 = new String(ch);
		System.out.println(s1); // ABCDE
		
		String s2 = new String(ch, 1, 3);
		System.out.println(s2); // BCD
	}

}
