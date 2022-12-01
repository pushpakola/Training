package com.dl.one;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Full Name: ");
		String nextLine = sc.nextLine();
		System.out.println(nextLine);

		System.out.println("Enter your First Name: ");
		String next = sc.next();
		System.out.println(next);

		sc.close();

	}

}
