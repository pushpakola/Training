package com.dl.two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Eg2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFive");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}
