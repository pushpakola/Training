package com.dl.seven.map;

import java.util.HashMap;

public class Eg2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(01, "NameOne");
		hashMap.put(02, "NameTwo");
		hashMap.put(03, "NameThree");
		hashMap.put(04, "NameFour");
		hashMap.put(05, null);
		System.out.println(hashMap.size()); // 5
		
		System.out.println(hashMap); // {1=NameOne, 2=NameTwo, 3=NameThree, 4=NameFour, 5=null}
		
		hashMap.remove(03);
		System.out.println(hashMap); // {1=NameOne, 2=NameTwo, 4=NameFour, 5=null}
		
		hashMap.remove(02, "NameTwoDupliate");
		System.out.println(hashMap); // {1=NameOne, 2=NameTwo, 4=NameFour, 5=null}
		
		hashMap.clear();
		System.out.println(hashMap);
		
	}
}
