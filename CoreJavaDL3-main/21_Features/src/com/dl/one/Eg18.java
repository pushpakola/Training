package com.dl.one;

import java.util.function.Predicate;

public class Eg18 {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hi";
		Predicate<String> p = Predicate.isEqual(s2);
		System.out.println(p.test(s1));
		System.out.println(p.test(s2));
		
		Predicate<String> predicate = (s)->s.length() > 5;
		System.out.println(predicate.test("Hello Java"));

	}

}
