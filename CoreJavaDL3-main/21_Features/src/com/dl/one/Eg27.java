package com.dl.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Eg27 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);

		Stream<Integer> sorted = list.stream().sorted();
		System.out.println("Sorting Order");
		sorted.forEach(n->System.out.println(n));
	}

}
