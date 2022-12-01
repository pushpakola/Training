package com.dl.one;

@FunctionalInterface
interface Logins {

	public abstract void login();

}

public class Eg8 {

	public static void main(String[] args) {

		Logins login = new Logins() {

			@Override
			public void login() {
				System.out.println("login() method invoked");

			}
		};
		login.login();
		
	}

}
