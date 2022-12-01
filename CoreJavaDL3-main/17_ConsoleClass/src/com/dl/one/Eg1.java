package com.dl.one;

import java.io.Console;

public class Eg1 {

	public static void main(String[] args) {
		
		Console console = System.console();
		String readLine = console.readLine();
		System.out.println(readLine);
		
		char[] readPassword = console.readPassword();
		String valueOf = String.valueOf(readPassword);
		System.out.println(valueOf);
	}

}
