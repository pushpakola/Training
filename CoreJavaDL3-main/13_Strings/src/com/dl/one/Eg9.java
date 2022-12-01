package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {
		
		//Immutable
		String s1 = "HelloJava";
		System.out.println(s1);
		
		//ThreadSafety //Mutable // 1.0
		StringBuffer stringBuffer = new StringBuffer("HelloJava");
		System.out.println(stringBuffer);
		
		//NoThreadSafety //Mutable // 1.5
		StringBuilder stringBuilder = new StringBuilder("HelloJava");
		System.out.println(stringBuilder);

	}

}
