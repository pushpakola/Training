package com.dl.one;

import java.util.ArrayList;
import java.util.List;

public class Eg3 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		list1.add(0, "NameOne");
		list1.add(1, "NameTwo");
		list1.add(2,"NameThree");
		list1.add(3, "NameFive");
		list1.add(4, "NameFour");
		System.out.println(list1);
		System.out.println(list1.size());
		
		List<String> list2 = new ArrayList<String>();
		list2.add(0, "Sai Kiran");
		list2.add(1, "Sai Ram");
		list2.add(2,"Sai Kumar");
		list2.add(3, "Sai Krishna");
		list2.add(4, "Sai Vamsi");
		System.out.println(list2);
		System.out.println(list2.size());
		
		list1.addAll(3, list2);
		System.out.println(list1);
		
		
		
		
		
	}
}
