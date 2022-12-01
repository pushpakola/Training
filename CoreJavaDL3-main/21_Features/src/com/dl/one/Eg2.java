package com.dl.one;

@FunctionalInterface
interface Varibales{
	
	public abstract void sum();
	
}
public class Eg2 implements Varibales{
	
	static int x = 5;
	int y = 10;

	public static void main(String[] args) {
		
		new Eg2().sum();

	}

	@Override
	public void sum() {
		int a = 10, b = 20;
		System.out.println(a+b);
		System.out.println(x + new Eg1().y);
		
	}

}
