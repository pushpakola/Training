package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {

		String s1 = "hello";
		System.out.println(s1);
		String s2 = "hello";
		System.out.println(s2);

		String s3 = "Hello";
		System.out.println(s3);

		System.out.println(s1 == s2);
		System.out.println(s3 == s1);

		String s4 = "Admin";
		String s5 = "Admin";
		String s6 = "admin";
		System.out.println(s4 == s5);
		System.out.println(s5 == s6);

	}
}
