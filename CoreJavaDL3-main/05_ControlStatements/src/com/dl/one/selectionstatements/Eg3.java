package com.dl.one.selectionstatements;

public class Eg3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 10;
		
		if(a<b) {
			System.out.println("Condition Validated 01");
		}
		
		if(b<a) {
			System.out.println("Condition Validated 02");
		}else {
			System.out.println("Condition Validation is Failed 02");
		}
		

		if(a!=c) {
			System.out.println("Condition Validated 03");
		}else {
			System.out.println("Condition Validation is Failed 03");
		}
	}

}
