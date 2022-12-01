package com.dl.three;

public class Eg1 {

	public static void main(String[] args) {
		
		//pt to st
		int i = 10;
		
		String string = Integer.toString(i);
		System.out.println("PT tp ST: " + string);
		
		String s2 = ""+i;
		System.out.println("PT tp ST: " + s2);
		
		//st to pt
		String s1 = "10";
		int parseInt = Integer.parseInt(s1);
		System.out.println("ST to PT: " + parseInt);
	}

}
