package com.dl.one;

import java.util.function.Predicate;

public class Eg15 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = x->(x>50);
		System.out.println(p.test(30));
	}
}
