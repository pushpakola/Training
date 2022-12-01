package com.dl.one;

@FunctionalInterface
interface Addition{
	
	void sum(int a, int b);
	
}
public class Eg3 {

	public static void main(String[] args) {

		Addition add = (x, y)->System.out.println("Sum is: " + (x+y));
		add.sum(10, 20);
	}

}
