package com.dl.five.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparator<Employee>{
	
	int id;
	String name;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return o1.name.compareTo(o2.name);
//	}
//	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.name.compareTo(o1.name);
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
		
		Collections.sort(list, new Employee());
		System.out.println("Asending/ Desending Order List: " + list);
		
		Collections.reverse(list);
		System.out.println("Reversing the list: " + list);
		
	}
}
