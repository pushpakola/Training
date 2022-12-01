package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		String s1 = new String("Java"); // SCP, HeapArea
		String s2 = new String("Python"); // SCP, HeapArea
		System.out.println(s1); // Java
		System.out.println(s2); // Python
		s1.concat(s2); // HeapArea
		String s3 = s1.concat(s2); // HeapArea
		System.out.println(s3); // JavaPython
		
		String s4 = new String("JavaPython"); // SCP HeapArea
		System.out.println(s4); // JavaPython
		System.out.println(s3==s4); // false
		
		String s5 = new String("JavaPython"); // SCP HeapArea
		System.out.println(s5);
		System.out.println(s5==s4); // false
		
	}
}
