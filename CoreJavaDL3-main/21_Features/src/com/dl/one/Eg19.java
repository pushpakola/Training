package com.dl.one;

import java.util.ArrayList;
import java.util.Iterator;

public class Eg19 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Admin 01");
		list.add("Admin 02");
		list.add("Admin 03");
		list.add("Admin 04");
		list.add("Admin 05");
		System.out.println(list); // Admin 01, Admin 02, Admin 03, Admin 04, Admin 05]

		// ClassName::MethodName
		list.forEach(System.out::println);

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		
		list.forEach(s -> System.out.println(s));

	}

}
