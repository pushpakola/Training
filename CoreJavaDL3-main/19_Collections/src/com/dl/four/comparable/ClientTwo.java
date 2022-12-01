package com.dl.four.comparable;

import java.util.ArrayList;
import java.util.Collections;

class EmployeeTwo implements Comparable<EmployeeTwo> {

	int id;
	String name;

	public EmployeeTwo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(EmployeeTwo emp) {

		return emp.name.compareTo(name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class ClientTwo {

	public static void main(String[] args) {

		EmployeeTwo emp1 = new EmployeeTwo(1, "B");
		EmployeeTwo emp2 = new EmployeeTwo(2, "D");
		EmployeeTwo emp3 = new EmployeeTwo(4, "A");
		EmployeeTwo emp4 = new EmployeeTwo(3, "C");

		ArrayList<EmployeeTwo> list = new ArrayList<EmployeeTwo>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println("Insertion Order in List: " + list);

		Collections.sort(list);
		System.out.println("Afetr Sorting Order: " + list);

		Collections.reverse(list);
		System.out.println("After reversing the list: " + list);

	}
}
