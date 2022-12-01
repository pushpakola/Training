package com.dl.seven.map;

import java.util.HashMap;

public class Eg1 {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(5, "NameFive");
		hashMap.put(3, "NameThree");
		hashMap.put(1, "NameOne");
		hashMap.put(4, "NameFour");
		hashMap.put(2, "NameTwo");
		hashMap.put(2, "NameTwoDuplicate"); // can update the value using key
		hashMap.put(6, "NameSix");
		hashMap.put(8, null);
		hashMap.put(9, null);
		hashMap.put(null, null);
		hashMap.put(null, null);
		System.out.println(hashMap); // {null=null, 1=NameOne, 2=NameTwoDuplicate, 3=NameThree, 4=NameFour, 5=NameFive, 6=NameSix, 8=null, 9=null}

	}

}
