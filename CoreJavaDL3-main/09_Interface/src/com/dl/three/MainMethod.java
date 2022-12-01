package com.dl.three;

public class MainMethod {

	public static void main(String[] args) {
		
		ClientThree clientThree = new ClientThreeImpl();
		clientThree.m1();
		clientThree.m2();
		
		ClientThreePlus clientThreePlus = new ClientThreeImpl();
		clientThreePlus.m3();
		clientThreePlus.m4();
		
		ClientThreeImpl clientThreeImpl = new ClientThreeImpl();
		clientThreeImpl.m1();
		clientThreeImpl.m2();
		clientThreeImpl.m3();
		clientThreeImpl.m4();
	}
}
