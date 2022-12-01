package com.dl.one;

import java.util.Stack;

public class Eg18 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("D");
		stack.push("C");
		stack.push("B");
		stack.push("A");
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
	}

}
