package com.dl.three.transferstatements;

public class Eg1 {

	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
		
			if(i==5) {
				//continue; // skips the current iteration
				break; // stop the iteration;
			}
			System.out.println(i);
		}
	}

}
