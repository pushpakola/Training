package com.dl.two;

public class Eg5 {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = new String("Python");
		String s3 = new String("Java");
		String s4 = new String("JavaScript");
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // false
		
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // false
		System.out.println(s1 == s4); // false
		
		String s5 = "Java";
		System.out.println(s5.equals(s1)); // true
		
		

	}

}
