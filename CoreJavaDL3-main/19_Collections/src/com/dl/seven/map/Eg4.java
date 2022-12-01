package com.dl.seven.map;

import java.util.LinkedHashMap;

public class Eg4 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(2, "NameTwo");
		map.put(2, "NameTwoDupliacte"); //duplicate keys overrides the data
		map.put(03, "NameThree");
		map.put(01, "NameOne");
		map.put(04, "NameFour");
		map.put(05, "NameFour"); //duplicate values repeated
		map.put(null, null);
		System.out.println(map);
	}

}
