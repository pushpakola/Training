package com.dl.ten.thiskeyword;

public class CreateAccount {

	int userId;
	String firstName;
	String lastName;
	String email;
	long contact;

	public CreateAccount(int userId, String firstName, String lastName, String email, long contact) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
	}

	public static void main(String[] args) {
		
		CreateAccount createAccount = new CreateAccount(10, "admin", "admin", "admin@info", 9876543210L);
		createAccount.display();
		
	}
	
	public void display() {
		System.out.println(userId);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(contact);
	}
	
}
