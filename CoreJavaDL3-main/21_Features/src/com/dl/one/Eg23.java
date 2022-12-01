package com.dl.one;

import java.util.stream.Stream;

public class Eg23 {

	public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of(1,2,3,4,5,6);
		System.out.println(s.count());
	}
}
