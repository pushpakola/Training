package com.dl.four;

class A implements Runnable {

	@Override
	public void run() {

		System.out.println(" 04 Run Method of Class A");

		synchronized (this) {
			System.out.println(" 05 Synchronized Block of Class A");
			
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " Loop Inside Run Method and Synchronized Block");
			}
			notify();
		}
	}

}

public class B {

	public static void main(String[] args) throws InterruptedException {
		
		A a = new A();
		System.out.println(" 01 Object A ref: " + a);
		
		Thread t = new Thread(a);
		t.start();
		System.out.println(" 02 Start Method");
		
		synchronized (a) {
			System.out.println(" 03 Synchronized Block of Class B");
			a.wait();
			
			for (int i = 0; i < 5; i++) {
				System.out.println(i + " 	Loop Inside Synchronized Block");
			}
		}
	}
}


//01 Object A ref: com.dl.four.A@3f8f9dd6
//02 Start Method
//03 Synchronized Block of Class B
//04 Run Method of Class A
//0 	Loop Inside Synchronized Block
//1 	Loop Inside Synchronized Block
//2 	Loop Inside Synchronized Block
//3 	Loop Inside Synchronized Block
//4 	Loop Inside Synchronized Block
//05 Synchronized Block of Class A
//0 Loop Inside Run Method and Synchronized Block
//1 Loop Inside Run Method and Synchronized Block
//2 Loop Inside Run Method and Synchronized Block
//3 Loop Inside Run Method and Synchronized Block
//4 Loop Inside Run Method and Synchronized Block
