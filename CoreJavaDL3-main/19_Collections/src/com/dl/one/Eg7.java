package com.dl.one;

import java.util.ArrayList;
import java.util.List;

public class Eg7 {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add(0, "A");
		l.add(1, "B");
		l.add(2, "C");
		l.add(3, "D");
		l.add(4, "E");
		l.add(5, "F");
		System.out.println(l);
		
		System.out.println(l.indexOf("A"));
		System.out.println(l.indexOf("F"));
		System.out.println(l.indexOf("Z"));

	}

}
