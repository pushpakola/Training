package com.dl.three;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Eg4 {

	public static void main(String[] args) {
	
		NavigableSet<Integer> integers = new TreeSet<Integer>();
		integers.add(65);
		integers.add(70);
		integers.add(66);
		integers.add(68);
		integers.add(67);
		integers.add(80);
		integers.add(85);
		integers.add(82);
		integers.add(72);
		integers.add(74);
		System.out.println(integers); // [65, 66, 67, 68, 70, 72, 74, 80, 82, 85]
		
		System.out.println(integers.descendingSet()); // [85, 82, 80, 74, 72, 70, 68, 67, 66, 65]
		
		System.out.println(integers.ceiling(72)); // 72
		System.out.println(integers.ceiling(90)); // null
		System.out.println(integers.ceiling(71)); // 72
		
		System.out.println(integers.higher(72)); // 74
		System.out.println(integers.higher(80)); // 82
		System.out.println(integers.higher(90)); // null
		
		System.out.println(integers.floor(72)); //72
		System.out.println(integers.floor(66)); //66
		System.out.println(integers.floor(64)); // null
		System.out.println(integers.floor(69)); //68
		
		System.out.println(integers.lower(85)); // 82
		System.out.println(integers.lower(90)); // 85
		System.out.println(integers.lower(66)); // 65
		System.out.println(integers.lower(65)); // null
		
		System.out.println(integers.pollFirst()); // 65
		System.out.println(integers.pollLast()); // 85
	}  

}
