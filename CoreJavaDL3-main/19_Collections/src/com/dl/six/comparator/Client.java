package com.dl.six.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(4, "A");
		Employee emp2 = new Employee(2, "C");
		Employee emp3 = new Employee(1, "B");
		Employee emp4 = new Employee(5, "E");
		Employee emp5 = new Employee(3, "D");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		System.out.println("Insertion Order: " + list);
		
		Collections.sort(list, new CompareIds());
		System.out.println("Asending Order Ids is: " + list);
		
		Collections.sort(list, new CompareNames());
		System.out.println("Asending Order Names is: " + list);
	}
}
