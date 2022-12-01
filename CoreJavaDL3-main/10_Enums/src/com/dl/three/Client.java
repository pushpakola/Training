package com.dl.three;

enum Books{
	
	JavaBook, PythonBook, JavaScriptBook;
}
public class Client {

	public static void main(String[] args) {
		
		Books valueOf = Books.valueOf("PythonBook");
		System.out.println(valueOf);
		
		Books[] values = Books.values();
		for (Books books : values) {
			System.out.println(books);
			System.out.println(books.ordinal());
		}
	}
}
