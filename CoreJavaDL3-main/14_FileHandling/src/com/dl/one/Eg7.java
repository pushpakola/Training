package com.dl.one;

import java.io.FileInputStream;
import java.io.IOException;

public class Eg7 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("one.txt");
		System.out.println("Before Bytes: " + fileInputStream.available());
		fileInputStream.read();
		fileInputStream.read();
		fileInputStream.read();
		fileInputStream.read();
		System.out.println("After Bytes: " + fileInputStream.available());
		fileInputStream.close();
	}

}
