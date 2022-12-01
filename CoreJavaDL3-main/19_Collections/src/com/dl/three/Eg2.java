package com.dl.three;

import java.util.LinkedHashSet;

public class Eg2 {

	public static void main(String[] args) {

		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
		hashSet.add("NameOne");
		hashSet.add("NameTwo");
		hashSet.add("NameThree");
		hashSet.add("NameFour");
		hashSet.add("NameFive");
		hashSet.add("NameSix");
		hashSet.add("NameOne");
		hashSet.add("NameTwo");
		hashSet.add(null);
		hashSet.add(null);
		System.out.println(hashSet);

	}

}
