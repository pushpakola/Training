package com.dl.one;

public class Eg12 {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Main Thread");
				}
				
			}
		});
		t.start();
		
	}

}
