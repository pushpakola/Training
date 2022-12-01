package com.dl.three;

import java.util.SortedSet;
import java.util.TreeSet;

public class Eg3 {

	public static void main(String[] args) {
		
		SortedSet<String> set = new TreeSet<String>();
		set.add("D");
		set.add("A");
		set.add("B");
		set.add("E");
		set.add("C");
		set.add("a");
		set.add("F");
		set.add("c");
		set.add("b");
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("C"));
		System.out.println(set.tailSet("D"));
		System.out.println(set.subSet("B", "b"));
	}

}
