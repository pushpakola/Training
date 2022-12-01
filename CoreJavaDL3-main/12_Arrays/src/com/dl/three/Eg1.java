package com.dl.three;

import java.util.Arrays;

public class Eg1 {

	public static void main(String[] args) {
		
		int []a = {10,20,30,40,50};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		
		int []b = new int[5];
		System.out.println(b);
		Arrays.fill(b, 10);
		System.out.println(Arrays.toString(b));
		
		int c[] = {10,20,30,40,50};
		int d[] = {10,20,30,40,50};
		System.out.println(Arrays.equals(c, d));
		
		int e[] = {30,50,20,10,40};
		System.out.println(e);
		Arrays.sort(e);
		System.out.println(Arrays.toString(e));

	}

}
