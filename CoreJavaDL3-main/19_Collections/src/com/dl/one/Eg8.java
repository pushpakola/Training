package com.dl.one;

import java.util.ArrayList;
import java.util.List;

public class Eg8 {

public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add(0, "A");
		l.add(1, "B");
		l.add(2, "C");
		l.add(3, "D");
		l.add(4, "E");
		l.add(5, "F");
		l.add(6, "F");
		System.out.println(l);
		
		List<String> l1 = new ArrayList<String>(l);
		l1.add(0, "NameZero");
		l1.add(1, "NameOne");
		l1.add(2, "NameTwo");
		l1.add(3, "NameThree");
		l1.add(4, "NameFour");
		l1.add(5, "NameFive");
		System.out.println(l1);

	}

}
