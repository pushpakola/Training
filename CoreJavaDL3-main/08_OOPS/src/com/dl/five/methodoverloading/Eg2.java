package com.dl.five.methodoverloading;

public class Eg2 {
	
	public void userDeatails(int id, String fname, String lname, String city, long userContact) {
		System.out.println(id);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(city);
		System.out.println(userContact);
	}

	public void userDeatails(int id, String fname, String lname, String city) {
		System.out.println(id);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(city);
	}
	
	public static void main(String[] args) {

		new Eg2().userDeatails(1, "Admin", "Admin", "Hyd", 9876543210L);
		new Eg2().userDeatails(2, "Admin", "Admin", "Hyd");
	}

}
