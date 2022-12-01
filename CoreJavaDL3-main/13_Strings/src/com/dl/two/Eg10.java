package com.dl.two;

public class Eg10 {

	public static void main(String[] args) {
		
		String s1 = new String("A");
		String s2 = new String("B");
		String s3 = new String("a");
		String s4 = new String("b");
		
		System.out.println(s1.compareToIgnoreCase(s3)); // 0
		System.out.println(s1.compareToIgnoreCase(s2)); // -1
		System.out.println(s1.compareTo(s4)); //A - b

	}

}
