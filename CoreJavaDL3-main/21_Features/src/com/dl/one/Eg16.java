package com.dl.one;

import java.util.function.Predicate;

public class Eg16 {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = a-> a>100;
		Predicate<Integer> p2 = a-> a<300;
		
		Predicate<Integer> predicate = p1.and(p2);
		boolean test = predicate.test(200);
		System.out.println(test);
		System.out.println("200 > 100 and 200 < 300 so it is true");
	}

}
