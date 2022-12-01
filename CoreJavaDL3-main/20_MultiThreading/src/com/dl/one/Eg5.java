package com.dl.one;

public class Eg5 extends Thread {

	public static void main(String[] args) {

		Eg5 eg1 = new Eg5();
		Eg5 eg2 = new Eg5();
		Eg5 eg3 = new Eg5();
		
		System.out.println(eg1.getPriority()); // 5
		System.out.println(eg2.getPriority()); // 5
		System.out.println(eg3.getPriority()); // 5
		
		eg1.setPriority(7);
		eg2.setPriority(9);
		eg3.setPriority(6);
		
		System.out.println(eg1.getPriority()); // 7
		System.out.println(eg2.getPriority()); // 9
		System.out.println(eg3.getPriority()); // 6
		
		eg1.setPriority(MAX_PRIORITY);
		eg2.setPriority(MIN_PRIORITY);
		eg3.setPriority(NORM_PRIORITY);
		
		System.out.println(eg1.getPriority()); // 10
		System.out.println(eg2.getPriority()); // 1
		System.out.println(eg3.getPriority()); // 5
		
		
	}

}
