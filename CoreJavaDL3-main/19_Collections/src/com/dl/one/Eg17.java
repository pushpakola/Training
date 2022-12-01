package com.dl.one;

import java.util.Stack;

public class Eg17 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.add("NameOne");
		stack.add("NameTwo");
		stack.add("NameThree");
		stack.add("NameFour");
		stack.add("NameFive");
		stack.add("NameSix");
		stack.add(0, "NameZero");
		System.out.println(stack);

	}

}
