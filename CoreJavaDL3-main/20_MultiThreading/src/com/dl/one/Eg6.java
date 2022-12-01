package com.dl.one;

public class Eg6 extends Thread{

	public static void main(String[] args) {
		
		//ThreadGroup group = new ThreadGroup("Group Thread Name");
		
		Eg6 eg1 = new Eg6();
		Thread t1 = new Thread(eg1);
		t1.start();
		System.out.println(t1.isAlive());
		
		Eg6 eg2 = new Eg6();
		Thread t2 = new Thread(eg2);
		t2.start();
		System.out.println(t2.isAlive());
		
		Eg6 eg3 = new Eg6();
		Thread t3 = new Thread(eg3);
		t3.start();
		System.out.println(t3.isAlive());
		
		System.out.println(Thread.activeCount());

	}

}
