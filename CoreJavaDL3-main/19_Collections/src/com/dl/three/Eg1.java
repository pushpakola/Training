package com.dl.three;

import java.util.HashSet;

public class Eg1 {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
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
