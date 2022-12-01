package com.dl.one;

public class Eg7 extends Thread{
	
	public Eg7(String threadName, ThreadGroup threadGroup) {
		super(threadGroup, threadName);
		start();
	}

	public static void main(String[] args) {

		ThreadGroup group = new ThreadGroup("Group Thread Name");
		
		Eg7 t1 = new Eg7("Thread 1", group);
		Eg7 t2 = new Eg7("Thread 2", group);
		Eg7 t3 = new Eg7("Thread 3", group);
		System.out.println(group.activeCount());
	}
	
	@Override
	public void run() {
		System.out.println("Current Thread: " + Thread.currentThread());
	}

}
