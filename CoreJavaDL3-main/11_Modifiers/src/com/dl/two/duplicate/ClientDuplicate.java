package com.dl.two.duplicate;

import com.dl.two.Addition;

public class ClientDuplicate extends Addition{

	public static void main(String[] args) {
		
		System.out.println(new ClientDuplicate().addTwoNumber(10, 20));
		System.out.println(new ClientDuplicate().addThreeNumber(10, 20, 30));
	}
}
