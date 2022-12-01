package com.dl.two;

public class Eg4 {

	public static void main(String[] args) {
		

		String s1 = new String("Java"); // 2 Objects //SCP-Java  //Heap Area-Java
		String s2 = s1.concat("Python"); // 2 Objects // SCP-Python // HeapArea - JavaPython
		String s3 = s2.concat("JavaScript"); // 2 Objects // SCP-JavaScript // HeapArea - JavaPythonJavaScript
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
