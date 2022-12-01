package com.dl.seven.map;

import java.util.TreeMap;

public class Eg5 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(3, "NameThree");
		map.put(2, "NameTwo");
		map.put(1, "NameOne");
		map.put(1, "NameOneDuplicate"); //duplicate keys overrides
		map.put(4, "NameFour");
		map.put(5, "NameFive");
		map.put(6, "NameSix"); //values can be duplicated
		map.put(7, "NameSix"); //values can be duplicated
		map.put(8, null); //Null allowed at value sides
		map.put(9, null); //Null allowed at value sides
		// map.put(null, "NameTen"); // java.lang.NullPointerException
		System.out.println(map); // 
		

	}

}
