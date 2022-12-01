package com.dl.one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Eg9 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("NameOne");
		set.add("NameFour");
		set.add("NameTwo");
		set.add("NameSix");
		set.add("NameFive");
		set.add("NameThree");
		set.add("NameSix");
		System.out.println(set); // [NameOne, NameFive, NameFour, NameTwo, NameSix, NameThree]
		
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);

	}

}
