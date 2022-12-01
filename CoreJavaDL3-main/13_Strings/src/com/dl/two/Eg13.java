package com.dl.two;

public class Eg13 {

	public static void main(String[] args) {
		
		String s1 = "Java";
		System.out.println(s1.replace("J", "j")); // java
		System.out.println(s1.replace("Java", "Python")); // Python
		
		String s3 = new String("Java Programming and Java Programs");
		System.out.println(s3.replace("Pro", "pre")); // Java pregramming and Java pregrams
		System.out.println(s3.replaceAll("a", "A")); // JAvA ProgrAmming And JAvA ProgrAms
		System.out.println(s3.replaceFirst("P", "p"));

	}

}
