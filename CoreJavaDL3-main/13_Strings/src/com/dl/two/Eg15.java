package com.dl.two;

public class Eg15 {

	public static void main(String[] args) {
		
		String s1 = new String("Hello Java and Hello Python");
		String[] split = s1.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		
		String s2 = new String("Hello:Java:and:Hello:Python");
		String[] split2 = s2.split(":");
		for (String string2 : split2) {
			System.out.println(string2);
		}
		
		String s3 = new String("HelloandJavaandHelloandPython");
		String[] split3 = s3.split("and");
		for (String string3 : split3) {
			System.out.println(string3);
		}
		
		String s4 = new String("HelloJava and HelloPython");
		String[] split4 = s4.split(" ", 3);
		for (String string4 : split4) {
			System.out.println(string4);
		}
		
		String s5 = String.join(" ", "Hello", "Java", "Hello", "Python");
		System.out.println(s5);
	}

}
