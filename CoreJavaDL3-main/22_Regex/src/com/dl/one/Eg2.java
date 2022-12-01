package com.dl.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eg2 {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("and");
		Matcher matcher = pattern.matcher("Hello Java and Hello Python and Hello JavaScript");
		
		while(matcher.find()){
			System.out.println("Start: " + matcher.start());
			System.out.println("End: " + matcher.end());
			System.out.println("Group: " + matcher.group());
		}
	}
}
