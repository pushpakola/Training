package com.dl.one;

public class Eg4 {
	
	public int []a;
	protected int []b;
	private int c[];
	int d[] = {10,20,30,40,50};

	public static void main(String[] args) {
		
		System.out.println(new Eg4().a);
		System.out.println(new Eg4().b);
		System.out.println(new Eg4().c);
		System.out.println(new Eg4().d[0]);
		System.out.println(new Eg4().d[1]);
		System.out.println(new Eg4().d[2]);
		System.out.println(new Eg4().d[3]);
		System.out.println(new Eg4().d[4]);
	}
}
