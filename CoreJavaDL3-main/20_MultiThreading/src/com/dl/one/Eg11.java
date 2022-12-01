package com.dl.one;

class A extends Thread{
	
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("Thread A: " + i);
				Thread.yield();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("Thread B: " + i);
				//Thread.yield();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Eg11 {

	public static void main(String[] args) {
		
		Thread a = new A();
		Thread b = new B();
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(Thread.MAX_PRIORITY);
		a.start();
		b.start();
	}

}
