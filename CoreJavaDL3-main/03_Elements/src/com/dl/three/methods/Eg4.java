package com.dl.three.methods;

public class Eg4 {

	public static void main(String[] args) {
		
		Eg4.add("Sai", "IT");
		new Eg4().remove("Sai", "IT");

	}

	// Static Method
	public static void add(String userName, String userJob) {

		System.out.println(userName);
		System.out.println(userJob);
	}

	// Instance Method
	public void remove(String userName, String userJob) {
		System.out.println(userName);
		System.out.println(userJob);
	}
}
