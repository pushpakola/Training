package com.dl.twelve;

class Parent{
	
	int i = 10;
	int j = 20;
	
}
public class Child extends Parent{

	int i = 30;
	int j = 40;
	
	public void add(int i, int j) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(super.i);
		System.out.println(super.j);
	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.add(100, 200);
	}
}
