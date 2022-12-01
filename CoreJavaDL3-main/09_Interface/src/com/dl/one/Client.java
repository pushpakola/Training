package com.dl.one;

public class Client extends ClientOneImpl{

	public static void main(String[] args) {
		
		// ClientOne clientOne = new ClientOne();
		
		Client client = new Client();
		client.m1();
		client.m2();
		
		ClientOneImpl impl = new ClientOneImpl();
		impl.m1();
		impl.m2();
	}
}
