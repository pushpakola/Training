package com.dl.one;

@FunctionalInterface
interface Sigin {

	public abstract void login();

}

class UserOne implements Sigin {

	@Override
	public void login() {
		System.out.println("Login Method Invoked");
	}

}

public class Eg7 {

	public static void main(String[] args) {

		UserOne user = new UserOne();
		user.login();
		
		Sigin sigin = new UserOne();
		sigin.login();
	}

}
