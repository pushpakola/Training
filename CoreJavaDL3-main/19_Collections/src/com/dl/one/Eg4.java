package com.dl.one;

import java.util.ArrayList;
import java.util.List;

public class Eg4 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add(0, "NameZero");
		list1.add(1, "NameOne");
		list1.add(2,"NameTwo");
		list1.add(3, "NameThree");
		list1.add(4, "NameFour");
		System.out.println(list1);
		
		list1.set(2, "NameTwoDuplicate");
		System.out.println(list1);
		
		list1.set(4, "NameFourDuplicate");
		System.out.println(list1);

	}

}
