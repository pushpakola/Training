package com.dl.seven.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Eg3 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(01, "NameOne");
		hashMap.put(02, "NameTwo");
		hashMap.put(03, "NameThree");
		hashMap.put(04, "NameFour");
		hashMap.put(05, "NameFive");
		
		Collection<String> values = hashMap.values();
		System.out.println("Set of Values: " + values);
		
		Set<Integer> keySet = hashMap.keySet();
		System.out.println("Set of keys: " + keySet);

	}

}
