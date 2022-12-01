package com.dl.three;

import java.util.ArrayList;

public class Eg5 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		int l1 = list.get(0).compareTo("A");
		System.out.println(l1); // 0
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("A");
		int l2 = list2.get(0).compareTo("B");
		System.out.println(l2); // -1
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("B");
		int l3 = list3.get(0).compareTo("A");
		System.out.println(l3); // 1
		
		

	}

}
