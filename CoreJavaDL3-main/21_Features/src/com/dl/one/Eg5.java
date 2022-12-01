package com.dl.one;

@FunctionalInterface
interface Add{
	
	public abstract void m1();
	
}
public class Eg5 {

	int a;
	int b;
	
	public Eg5(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void sum() {
		Add add = ()->{
			System.out.println(a+b);
		};
		add.m1();
	}

	public static void main(String[] args) {
		
		new Eg5(10, 20).sum();

	}

}
