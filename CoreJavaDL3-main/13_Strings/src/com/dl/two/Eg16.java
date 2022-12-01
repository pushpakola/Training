package com.dl.two;

public class Eg16 {

	public static void main(String[] args) {
		
		String s1 = new String("Hello Java Hello Python");
		String[] split = s1.split(" ");
		for (String string : split) {
			System.out.println(string);
		} 
		
		String s2 = String.join(" ", "Hello", "Java", "Hello", "Python");
		System.out.println(s2);
	}

}
