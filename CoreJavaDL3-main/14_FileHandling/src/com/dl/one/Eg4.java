package com.dl.one;

import java.io.FileOutputStream;
import java.io.IOException;

public class Eg4 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream outputStream = new FileOutputStream("one.txt", true);
		String s1 = "Hello Spring";
		byte[] bytes = s1.getBytes();
		outputStream.write(bytes);
		System.out.println("New File Created and Data Inserted");
		outputStream.close();
	}

}
