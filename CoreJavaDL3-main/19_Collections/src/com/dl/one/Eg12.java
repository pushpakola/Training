package com.dl.one;

import java.util.ArrayList;
import java.util.LinkedList;

public class Eg12 {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("C");
		l1.add("B");
		l1.add("A");
		l1.add("D");
		System.out.println(l1);

		l1.sort(null);
		System.out.println(l1);
		
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("C");
		l2.add("B");
		l2.add("A");
		l2.add("D");
		System.out.println(l2);

		l2.sort(null);
		System.out.println(l2);


	}

}
