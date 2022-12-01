package com.dl.one;

import java.util.regex.Pattern;

public class Eg3 {

	public static void main(String[] args) {

		System.out.println(Pattern.matches("[Hello]", "H"));
		System.out.println(Pattern.matches("[Hello]", "h"));

		System.out.println(Pattern.matches("[Hello]?", "H"));
		System.out.println(Pattern.matches("[Hello]?", "h"));

		// + : one or more characters
		System.out.println(Pattern.matches("[Hello]+", "e"));
		System.out.println(Pattern.matches("[Hello]+", "ell"));
		System.out.println(Pattern.matches("[Hello]", "he"));

		// * : zero or more characters
		System.out.println(Pattern.matches("[Hello]*", "e"));
		System.out.println(Pattern.matches("[Hello]*", "ell"));
		System.out.println(Pattern.matches("[Hello]*", "he"));

		// \\d : digits
		System.out.println(Pattern.matches("\\d", "e"));
		System.out.println(Pattern.matches("\\d", "1"));

		// \\D : Digits
		System.out.println(Pattern.matches("\\D", "e"));
		System.out.println(Pattern.matches("\\D", "1"));
		
		//length{}
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4}", "eeee"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{4,8}", "java1234"));


	}

}
