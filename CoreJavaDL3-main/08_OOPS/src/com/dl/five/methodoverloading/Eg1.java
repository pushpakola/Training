package com.dl.five.methodoverloading;

public class Eg1 {

	public void getFuelCost(float petrolPrice, float dieselPrice) {

		System.out.println("Petrol price is: " + petrolPrice + " and " + "Diesel Price is: " + dieselPrice);
	}

	public void getFuelCost(int petrolPrice, int dieselPrice) {

		System.out.println("Petrol price is: " + petrolPrice + " and " + "Diesel Price is: " + dieselPrice);
	}

	public static void main(String[] args) {

		new Eg1().getFuelCost(85.64f, 75.78f);
		new Eg1().getFuelCost(85, 75);
	}
}
