package com.dl.four.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee{

	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

//	@Override
//	public int compareTo(Employee emp) {
//		
//		return name.compareTo(emp.name);
//	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
public class Client {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "B");
		Employee emp2 = new Employee(2, "D");
		Employee emp3 = new Employee(4, "A");
		Employee emp4 = new Employee(3, "C");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println("Insertion Order in List: " + list);
		
		list.sort(null);
		System.out.println(list);
//		Collections.sort(null);
//		System.out.println("Afetr Sorting Order: " + list);
		
		Collections.reverse(list);
		System.out.println("After reversing the list: " + list);
		
	}
}
