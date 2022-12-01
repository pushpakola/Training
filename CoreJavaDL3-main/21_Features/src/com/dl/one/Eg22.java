package com.dl.one;

@FunctionalInterface
interface StudentIn{
	
	Student id(int id, String name);
}

class Student{
	
	public Student(int id, String name) {
		System.out.println(id + " " + name);
	}
	
}
public class Eg22 {

	public static void main(String[] args) {
		
		StudentIn ref = Student::new;
		ref.id(101, "Admin 01");
		ref.id(102, "Admin 02");
		ref.id(103, "Admin 03");
		ref.id(104, "Admin 04");
		ref.id(105, "Admin 05");

	}

}
