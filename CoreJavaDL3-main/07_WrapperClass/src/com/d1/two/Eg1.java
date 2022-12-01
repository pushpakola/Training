package com.d1.two;

public class Eg1 {

	public static void main(String[] args) {
		
		//ST to OT
		String s1 = "10";
		Integer i1 = new Integer(s1);
		System.out.println("ST to OT: " + i1);
		
		Integer valueOf = Integer.valueOf(s1);
		System.out.println("ST to OT: " + valueOf);
		
		//OT to ST
		Integer i2 = new Integer(10);
		String string = i2.toString();
		System.out.println("OT to ST: " + string);
		
		String s2 = "" + i2 + "";
		System.out.println("OT to ST: " + s2);

	}

}
