package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		//Both conditions must satisfy
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		
		//If any condition is failed then it will be false
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false
		
		System.out.println(false != true); // false // true
	}
}
