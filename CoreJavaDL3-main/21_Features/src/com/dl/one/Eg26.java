package com.dl.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Eg26 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		Stream<Integer> myStream = list.stream();
		
		Optional<Integer> min = myStream.min(Integer::compare);
		if(min.isPresent()) {
			System.out.println("Mininum Value is: " + min.get());
		}
		
		myStream = list.stream();
		Optional<Integer> max = myStream.max(Integer::compare);
		if(max.isPresent()) {
			System.out.println("Maximum Value is: " + max.get());
		}
	}

}
