package com.dl.ten.thiskeyword;

public class Profile {
	
	public void add() {
		System.out.println("Add Method");
	}
	
	public void get() {
		System.out.println("Get Method");
	}
	
	public void put() {
		System.out.println("Put Mehtod");
		this.add(); //this.add();
	}

	public static void main(String[] args) {
		
		new Profile().put();

	}

}
