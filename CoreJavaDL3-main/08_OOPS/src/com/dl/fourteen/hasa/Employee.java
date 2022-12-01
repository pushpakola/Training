package com.dl.fourteen.hasa;

public class Employee {

	int id;
	String name;
	Address address; // data member
	
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
	}
	
	public static void main(String[] args) {
		
		Address add1 = new Address("Hyd", "TS", "India");
		Employee emp1 = new Employee(101, "NameOne", add1);
		emp1.display();
		
		Address add2 = new Address("Amarathi", "AP", "India");
		Employee emp2 = new Employee(102, "NameTwo", add2);
		emp2.display();
	}
	
}
