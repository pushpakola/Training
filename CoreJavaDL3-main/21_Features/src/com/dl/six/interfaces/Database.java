package com.dl.six.interfaces;

public interface Database {

	default void sendMessages() {
		connectNetwork();
		System.out.println("Multiple Messages Sent");
	}
	
	default void sendMessage() {
		connectNetwork();
		System.out.println("Single Messages Sent");
	}
	
	private void connectNetwork() {
		System.out.println("Network Connected");
	}
}
