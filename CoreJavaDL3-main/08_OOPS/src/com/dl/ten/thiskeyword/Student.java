package com.dl.ten.thiskeyword;

public class Student {

	public Student(int id) {
		System.out.println(id);
	}

	public Student() {
		this(10);
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {
		
		new Student();

	}

}
