package com.dl.one;

public class Eg13 {

	public static void main(String[] args) {

		Thread t = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Main Thread");
			}
		});
		t.start();
	}

}
