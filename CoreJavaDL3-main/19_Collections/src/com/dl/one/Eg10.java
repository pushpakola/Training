package com.dl.one;

import java.util.LinkedList;
import java.util.List;

public class Eg10 {

	public static void main(String[] args) {
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add(0, "NameOne");
		linkedList.add(1, "NameTwo");
		linkedList.add(2, "NameThree");
		linkedList.add(3, "NameFour");
		linkedList.add(4, "NameFive");
		System.out.println(linkedList);
		
		linkedList.remove(3);
		System.out.println(linkedList);
		
		linkedList.clear();
		System.out.println(linkedList);
	}

}
