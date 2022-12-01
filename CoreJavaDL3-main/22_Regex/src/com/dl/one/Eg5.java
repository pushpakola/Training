package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		String email = "saif@gmail.com";
		boolean matches = email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
		if(matches) {
			System.out.println("Email Valid");
		}else {
			System.out.println("Email Invalid");
		}

	}

}
