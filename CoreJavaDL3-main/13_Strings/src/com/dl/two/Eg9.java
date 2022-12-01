package com.dl.two;

public class Eg9 {

	public static void main(String[] args) {
		
		String s1 = new String("A");
		String s2 = new String("B");
		String s3 = new String("A");
		
		System.out.println(s1.compareTo(s2)); // -1 //s1<s2 // 65-66
		System.out.println(s1.compareTo(s3)); // 0 // 65-65
		System.out.println(s2.compareTo(s3)); // 1 // 66-65

	}

}
