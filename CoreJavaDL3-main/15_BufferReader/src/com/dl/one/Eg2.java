package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name");
		String readLine = reader.readLine();
		System.out.println("The name entered is: " + readLine);
		
		System.out.println("Enter your Name");
		int read = reader.read();
		System.out.println((char)read);

	}

}
