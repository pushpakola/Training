package com.dl.one;

import java.util.LinkedList;

public class Eg13 {

	public static void main(String[] args) {
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("C");
		l2.add("B");
		l2.add("A");
		l2.add("D");
		l2.add("E");
		l2.add("F");
		l2.add("G");
		System.out.println(l2); // [C, B, A, D, E, F, G]
		
		l2.addFirst("NameOne");
		System.out.println(l2);
		l2.removeFirst();
		System.out.println(l2);

	}

}
