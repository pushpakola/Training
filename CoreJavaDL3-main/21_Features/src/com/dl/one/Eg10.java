package com.dl.one;

class A implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("A Thread");
		}
	}

}

public class Eg10 {

	public static void main(String[] args) {

		A a = new A();
		Thread t = new Thread(a);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}
