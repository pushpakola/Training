package com.dl.one;

import java.util.Stack;

public class Eg19 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("D");
		stack.push("C");
		stack.push("B");
		stack.push("A");
		
		System.out.println(stack.search("D")); // 4
		System.out.println(stack.search("A")); //1
		System.out.println(stack.search("E")); // -1
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.pop());

	}

}
