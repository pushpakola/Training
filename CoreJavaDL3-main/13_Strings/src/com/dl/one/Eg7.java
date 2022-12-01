package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
		
		byte []bytes = {65,66,67,68,69};
		String s1 = new String(bytes);
		System.out.println(s1); // ABCDE
		
		byte []b = {65,66,67,68,69};
		String s2 = new String(b, 1, 3);
		System.out.println(s2); // BCD
	}

}
