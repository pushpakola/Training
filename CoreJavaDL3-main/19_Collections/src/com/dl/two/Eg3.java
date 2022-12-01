package com.dl.two;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Eg3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFive");

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("Next: " + listIterator.next());
		}
		
		while (listIterator.hasPrevious()) {
			System.out.println("Previous: " + listIterator.previous());
		}
	}

}
