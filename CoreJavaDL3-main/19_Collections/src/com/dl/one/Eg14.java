package com.dl.one;

import java.util.List;
import java.util.Vector;

public class Eg14 {

	public static void main(String[] args) {

		List<String> list = new Vector<String>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFive");
		list.add("NameFour");
		System.out.println(list);

		List<String> l2 = new Vector<String>(list);
		l2.add("One");
		l2.add("Two");
		l2.add("Three");
		l2.add("Five");
		l2.add("Four");
		System.out.println(l2);
	}
}
