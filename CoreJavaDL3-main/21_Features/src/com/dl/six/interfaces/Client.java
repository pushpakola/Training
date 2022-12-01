package com.dl.six.interfaces;

interface DB {

	public static void sendMessages() {
		connectNetwork();
		sendMessage();
		System.out.println("Multiple Messages Sent");
	}

	public static void sendMessage() {
		connectNetwork();
		System.out.println("Single Messages Sent");
	}

	private static void connectNetwork() {
		System.out.println("Network Connected");
	}
}
public class Client implements DB {

	public static void main(String[] args) {
		
//		Database d = new Client();
//		d.sendMessage();
//		d.sendMessages();
		
		DB.sendMessages();
		DB.sendMessage();
		
		
	}
}
