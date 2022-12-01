package com.dl.three;

import java.util.ArrayList;
import java.util.Collections;

public class Eg6 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("C");
		list.add("B");
		list.add("A");
		list.add("D");
		System.out.println(list); // [C, B, A, D]
		
		list.sort(null);
		System.out.println(list); // [A, B, C, D]
		
		Collections.reverse(list);
		System.out.println(list); // [D, C, B, A]
	}

}
