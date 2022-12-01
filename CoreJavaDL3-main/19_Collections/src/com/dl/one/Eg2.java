package com.dl.one;

import java.util.ArrayList;
import java.util.List;

public class Eg2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add(0, "NameOne");
		list.add(1, "NameTwo");
		list.add(2,"NameThree");
		list.add(3, "NameFive");
		list.add(4, "NameFour");
		System.out.println(list);
		System.out.println(list.size());
		
		list.add(2, "NameThreeDuplicate");
		System.out.println(list);
		System.out.println(list.size());
		
		
	}
}
