package com.dl.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Eg25 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Pradeep");
		list.add("Praneeth");
		list.add("Mahesh");
		list.add("Vikas");
		System.out.println(list);
		
		List<String> list2 = list.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list2);

	}

}
