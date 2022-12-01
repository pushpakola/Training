package com.dl.one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Eg11 {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();
		l1.add(null);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);

		List<String> l2 = new LinkedList<String>();
		l2.add(null);
		l2.add(null);
		l2.add(null);
		System.out.println(l2);

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		System.out.println(arrayList);

	}

}
