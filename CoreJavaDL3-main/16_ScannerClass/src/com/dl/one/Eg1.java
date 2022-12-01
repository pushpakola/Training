package com.dl.one;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id: ");
		int pId = sc.nextInt();
		System.out.println(pId);
		
		System.out.println("Enter product Name: ");
		String s1 = sc.next();
		System.out.println(s1);
		
		System.out.println("Enter product price: ");
		float price = sc.nextFloat();
		System.out.println(price);
		sc.close();

	}

}
