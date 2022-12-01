package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Python";
		
		System.out.println(s1+s2); // JavaPython
		
		String s3 = s1.concat(s2); 
		System.out.println(s3); //JavaPython // Heap
		
		String s4 = "JavaPython";
		System.out.println(s4); // JavaPython // SCP
		System.out.println(s4==s3); // false
		
		String s5 = "JavaPython"; 
		System.out.println(s5); // JavaPython // SCP
		System.out.println(s5==s4); // true
		
		String s6 = s1.concat(s2);
		System.out.println(s6);  // JavaPython // Heap
		System.out.println(s6==s3);  // false

	}

}
