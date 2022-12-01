package com.dl.two;

class ThreadOne extends Thread{
	
	public void m1() {
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " Non Synchronized Area");
		}
		
		synchronized(this) {
			
			for (int i = 6; i <= 10; i++) {
				System.out.println(i + " Synchronized Only some part of code");
			}
		}
		
		System.out.println("Non Synchronized Area");
	}
	
}
public class Eg2 extends Thread{

	ThreadOne one;

	public Eg2(ThreadOne one) {
		this.one = one;
	}
	
	public void run() {
		one.m1();
	}
	
	public static void main(String[] args) {
		
		ThreadOne t1 = new ThreadOne();
		Eg2 eg2 = new Eg2(t1);
		eg2.start();
		
	}
	
	
}
