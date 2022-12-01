package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		String s1 = "hello";
		System.out.println(s1); // scp
		
		String s2 = "hello";
		System.out.println(s2); // scp
		
		String s3 = "Hello";
		System.out.println(s3);
		
		System.out.println(s1==s2); //true
		System.out.println(s3==s1); // false
		
		s3 = "Hey";
		System.out.println(s3); // Hey
		
		s3 = "hello";
		System.out.println(s3==s1); // true

	}

}
