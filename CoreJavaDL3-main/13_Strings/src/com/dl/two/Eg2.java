package com.dl.two;

public class Eg2 {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1.concat(s2)); // JavaPython
		
		String s3 = "JavaScript";
		System.out.println(s1.concat(s3)); // JavaJavaScript
		
		System.out.println(s1.concat(s2).concat(s3)); // JavaPythonJavaScript
	}

}
