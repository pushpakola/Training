package com.dl.ten.hierarchialinheritance;

class RBI {

	public int rateOfInterest() {
		return 0;
	}
}

class ICICI {
	public int rateOfInterest() {
		return 5;
	}
}

class AXIS {
	public int rateOfInterest() {
		return 6;
	}

}

class SBI {

	public int rateOfInterest() {
		return 7;
	}
}

public class Client {

	public static void main(String[] args) {
		
		ICICI icici = new ICICI();
		System.out.println(icici.rateOfInterest());
		
		AXIS axis = new AXIS();
		System.out.println(axis.rateOfInterest());
		
		SBI sbi = new SBI();
		System.out.println(sbi.rateOfInterest());
	}
}
