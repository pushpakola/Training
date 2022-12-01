package com.dl.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eg1 {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("and");
		Matcher matcher = pattern.matcher("Hello Java and Hello Python and Hello JavaScript");
		boolean find = matcher.find();
		System.out.println(find);
		
		System.out.println(matcher.start());
		System.out.println(matcher.end());
		System.out.println(matcher.group());
		
	}
}
