package com.dl.one;

import java.util.Vector;

public class Eg16 {

	public static void main(String[] args) {

		Vector<String> list = new Vector<String>();
		list.add("NameOne");
		list.add("NameTwo");
		list.add("NameThree");
		list.add("NameFour");
		list.add("NameFive");
		list.add("NameFour");
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.firstElement());
		System.out.println(list.lastElement());
		list.insertElementAt("Sai", 6);
		System.out.println(list);
		
	}

}
