package com.dl.one;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eg4 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
		Matcher matcher = p.matcher("saif@gmail.com");
		if(matcher.find()) {
			System.out.println("Email Valid");
		}else {
			System.out.println("Invalid Email");
		}
	}

}
