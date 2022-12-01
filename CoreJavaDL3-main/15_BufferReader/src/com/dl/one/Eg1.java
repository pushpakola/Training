package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter any Number here: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = reader.readLine();
		int parseInt = Integer.parseInt(readLine);
		System.out.println("The value you entered is: " + parseInt);
	}

}
