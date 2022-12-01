package com.dl.two;

public class Eg11 {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = new String("JavaScript");
		String s3 = new String("Java and Python");
		
		System.out.println(s1.startsWith("J"));
		System.out.println(s2.endsWith("Script"));
		System.out.println(s3.contains("and"));
		System.out.println(s3.contains("is"));
		
	}

}
