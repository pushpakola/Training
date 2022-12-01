package com.dl.two;

public class Eg14 {

	public static void main(String[] args) {
		
		String s1 = "I like Java and I like Pyhton and I like JavaScript";
		System.out.println(s1.lastIndexOf("like")); // 36
		System.out.println(s1.lastIndexOf("liike")); // -1
		
		String s2 = "I like Java and I like JavaScript";
		System.out.println(s2.indexOf("like")); // 2
		System.out.println(s2.indexOf("like", 8)); // 18
		
		String s3 = "Java";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		String s4 = "Java is a Programming Language";
		System.out.println(s4.substring(1));
		System.out.println(s4.substring(1, 9));

	}

}
