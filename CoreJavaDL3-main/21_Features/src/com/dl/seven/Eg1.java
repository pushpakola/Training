package com.dl.seven;

import java.util.List;

public class Eg1 {

	public static void main(String[] args) {
		
		List<String> of = List.of("abc", "xyz", "def");
		of.add("apple");
		System.out.println(of);
	}
}
