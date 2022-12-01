package com.dl.one;

import java.util.ArrayList;
import java.util.List;

public class Eg5 {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(0, 1);
		list1.add(1, 2);
		list1.add(2, 3);
		list1.add(3, 4);
		list1.add(4, 5);
		System.out.println(list1);
		
		System.out.println(list1.get(2));
		
		System.out.println(list1.get(8));

	}

}
