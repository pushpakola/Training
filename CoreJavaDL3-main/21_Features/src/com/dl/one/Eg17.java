package com.dl.one;

import java.util.function.Predicate;

public class Eg17 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = a-> a>100;
		Predicate<Integer> predicate = p.negate();
		boolean b1 = predicate.test(90);
		System.out.println(b1);
		boolean b2 = predicate.test(101);
		System.out.println(b2);
	}

}
