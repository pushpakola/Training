package com.dl.one;

@FunctionalInterface
interface Log {

	public abstract void login();

}

public class Ex9 {

	public static void main(String[] args) {

		Log log = ()->{
			System.out.println("login() method invoked");
		};
		log.login();
	}

}
