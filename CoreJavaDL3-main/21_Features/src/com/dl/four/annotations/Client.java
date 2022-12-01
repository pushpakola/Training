package com.dl.four.annotations;

import java.util.ArrayList;
import java.util.List;

public class Client {

	@SuppressWarnings({ "deprecation", "rawtypes", "unused" })
	public static void main(String[] args) {
		
		A a = new A();
		a.m1();
		
		List list = new ArrayList();
	}
}
