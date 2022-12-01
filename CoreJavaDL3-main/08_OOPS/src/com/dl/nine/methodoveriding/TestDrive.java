package com.dl.nine.methodoveriding;

class Vechiles{
	
	public void buyVechile(String vechileName, String vechileColor) {
		System.out.println("Vechile Name: " + vechileName);
		System.out.println("Vechile Color: " + vechileColor);
	}
}

public class TestDrive extends Vechiles{

	public void buyVechile(String vechileName, String vechileColor) {
		System.out.println("Vechile Name: " + vechileName);
		System.out.println("Vechile Color: " + vechileColor);
	}
	
	public static void main(String[] args) {
		
		Vechiles v = new TestDrive();
		v.buyVechile("BMW", "Black");
	}
}
